// Giant Squid :: Weichen Liu + Blueface, Josiah Moltz +
// APCS pd06
// HW27 FOR the Love of Strings / String. methods / Using for loop and recursion to do repetitions with String methods
// 2021-10-28
// time spent: .4 hour (24 minutes)

/*
DISCO
  -You can increment or decrement in a for loop
  -.substring goes up to BUT NOT INCLUDING the endIndex given.

QCC
  -Is there a method to instantly print a reversed string?
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
    for(int i = stringLength; i > 0; i --) {
      result += s.substring(i - 1, i);
    }
    return result;
  }

  public static String reverseR(String s) {
    int length = s.length();
    if ( length == 1 ) {
      return s;
    }
    else {
      String last = s.substring(length - 1, length);
      String upToLast = s.substring(0,length - 1);
      return last + reverseR(upToLast);
    }
  }

	public static void main(String[] args) {
		System.out.println(fenceF(1));
    System.out.println(fenceF(2));
    System.out.println(fenceF(3));
		System.out.println(reverseF("stressed"));
    System.out.println(reverseF("hello world"));
    System.out.println(reverseR("stressed"));
    System.out.println(reverseR("hello world"));
	}
}
