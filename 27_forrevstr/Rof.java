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
		for(int i = 0; i < stringLength; i ++) {
			result += s.substring(stringLength - (i+1), stringLength - i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(fenceF(1));
		System.out.println(reverseF("stressed"));
	}
}
