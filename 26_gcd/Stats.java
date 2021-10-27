// Geese: Weichen Liu + Blueface, Anthony Sun + Corn, Brian Li + Robert
// APCS
// HW26 -- Using Recursive method and While loop to find GCD
// 2021-10-27

/*
DISCO:
- We have to set the base case of the recursive method to be (a == b). 
- If you misplace a braces, the error: class, interface or enum expected may show up.


QCC:
- Is there a more efficient way to replace the higher and lower numbers in gcdEW()?
*/

// skeleton taken from the closet

public class Stats {

  public static int mean(int a, int b) {
	int x= (a+b)/2;
  	return x;
  }

  public static double mean(double a, double b) {
	return (a+b)/2.0;
  }

  public static int max(int a, int b) {
	if (a > b) {
		return a;
	}
	return b;
  }

  public static double max(double a, double b) {
	if (a > b) {
		return a;
	}
	return b;
  }

  public static int geoMean(int a, int b) {
	   int x = (int) Math.sqrt(a*b);
     return x;
  }

  public static double geoMean(double a, double b) {
	return Math.sqrt(a*b);
  }

  public static int max(int a, int b, int c) {
	int max = a;
	if (b > a) {
		max = b;
	}
	if (c > max) {
		max = c;
	}
	return max;
  }

  public static double max(double a, double b, double c) {
	double max = a;
        if (b > a) {
                max = b;
        }
        if (c > max) {
                max = c;
        }
        return max;
  }

  public static int geoMean(int a, int b, int c) {
	int x = (int) Math.cbrt(a*b*c);
 	return x;
  }

  public static double geoMean(double a, double b, double c) {
	return Math.cbrt(a*b*c);
  }
  
  public static int gcd( int a , int b) {
	  int gcd = 0;
	  int divisor = 1;
	  int higher = 0;
	  int lower = 0;
	  if (a > b) {
		  higher = a;
		  lower = b;
	  } else {
		  higher = b;
		  lower = a;
	  }
	  while (divisor <= lower) {
		  if (higher % divisor == 0 && lower % divisor == 0) {
			  gcd = divisor;
			  divisor ++;
		  } else {
			  divisor ++;
		  }
	  }
	  return gcd;
  }
	
  public static int gcdER( int a, int b) {
	  int lower = a;
	  if (a == b) {
		  return a;
	  } else {
		  if (b < a) {
			  lower = b;
		  } 
		  return gcdER(lower, Math.abs(a - b));
	  }  
  }
	

  public static int gcdEW( int a, int b) {
	  int lower = a;
	  int higher = b;
	  int difference = 0;
	  if (b < a) {
		  lower = b;
		  higher = a;
	  } 
	  while ( higher != lower) {
		  if ((higher - lower) < lower) {
			  difference = higher - lower;
			  higher = lower;
			  lower = difference;
		  } else {
			  difference = higher - lower;
			  higher = difference;
		  }
	  }
	  return lower;	  
  }
  
  
	
  //main method for testing functionality
  public static void main( String[] args ) {
	System.out.println(gcd(15,18));
	System.out.println(gcd(3,14));
	System.out.println(gcd(16,28));
	System.out.println(gcdER(15,18));
	System.out.println(gcdER(3,14));
	System.out.println(gcdER(16,28));
	System.out.println(gcdEW(15,18));
	System.out.println(gcdEW(3,14));
	System.out.println(gcdEW(16,28));
  }

}//end class
