// Giant Squid :: 
// APCS
// HW27 - Using for loop and recursion to do repetitions
// 2021-10-27

/*
DISCO:
- We have to set the base case of the recursive method to be (a == b). 
- If you misplace a braces, the error: class, interface or enum expected may show up.
QCC:
- Is there a more efficient way to replace the higher and lower numbers in gcdEW()?
ALGO:
- By constantly replacing the higher number in the argument list with the difference between the higher number and the smaller number, we can achieve a point where the higher number is equal to the lower number. That is when we return either number.
*/

public class Rof {
	public static String fenceF(int posts) {
		String result = "|";
		for(int i = 1; i < posts; i ++) {
			result += "--|";
		}
		return result;
	}
	
	public static String reverseF(String s) {
		String result = "";
		int stringLength = s.length();
		for(int i = stringLength + 1; i > 1; i --) {
			result += s.substring(i - 2, i - 1);
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println(fenceF(1));
		System.out.println(reverseF("stressed"));
	}
}
