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
		for(int i = s.length(); i == 0; i --) {
			result += s.substring(i - 1, i - 2);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(fenceF(1));
		System.out.println(reverseF("stressed"));
	}
}
