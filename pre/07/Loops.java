/* Weichen Liu
APCS
HW05 -- SummerHW06
2021-09-27
*/

public class Loops { // Exercise 3
	
	public static double Power(double x, int n) {
		double Answer = 1;
		for (int i = 0; i < n; i++) {
			Answer = Answer * x;
		}
		return Answer;

	}
	
	public static int factorial(int a) { // Exercise 4
		int Answer = 1;
		int i = 1;
		while (i <= a) {
			Answer = Answer * i;
			i++;
		}
		return Answer;
	}
	
	public static double myexp(double x, double n) { //Exercise 5
		double Answer = 1.0;
		double Add = 1;
		int i = 1;
		while (i <= n) {
		    Add = Math.pow(x, i) / factorial(i);
		    Answer = Answer + Add;
		    i = i + 1;
		}
	    return Answer;
	}
	
	public static void check(double x) { 
        System.out.println(x + "\t" + myexp(x, 4) + "\t" + Math.exp(x)); 
	}
	
	public static void main(String[] args) {
		double x = 3.0;
		int n = 2;
		double Answer;
		Answer = Power(x, n);
		System.out.println(Answer);
		int a = 3;
		int Answer1;
		Answer1 = factorial(a);
		System.out.println(Answer1);
		check(1.0);
		double i = 0.1;
		while (i <= 100.0) {
			check(i);
			i * 10;
	}
	    double i = -0.1;
	    while (i >= -100.0) {
			check(i);
			i = i * 10
		}
	}
}
