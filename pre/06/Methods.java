/* Weichen Liu
APCS
HW05 -- SummerHW06
2021-09-27
*/

public class Methods {
	
	public static boolean isDivisible(int n, int m) { // exercise 2
		if (n % m == 0) {
			return true;
	}   else {
		    return false;
	}
}

    public static boolean isTriangle(int a, int b, int c) { //exercise 3
		if (a > b + c) {
			return false; // returns false is you can't form a triangle
		} else if (b > a + c) {
		    return false;
		} else if (c > a + b) {
			return false;
		} else {
			return true;
		}
}
	public static int ack(int m, int n) { //exercise 8
	    if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
			return ack(m - 1, 1);
        } else if (m > 0 && n > 0) {
			return ack(m - 1, ack(m, n - 1));
        } else {
            return 0;
        }			
}
	
	
	public static void main(String[] args) {
		int n = 55;
		int m = 5;
		boolean Result = isDivisible(n , m);
		System.out.println(Result);
		int a = 3;
		int b = 4;
		int c = 8;
		boolean Result2 = isTriangle(a, b , c);
		System.out.println(Result2);
		int x = 3;
		int y = 3;
		int Result3 = ack(x, y);
		System.out.println(Result3);
    }
    
}

