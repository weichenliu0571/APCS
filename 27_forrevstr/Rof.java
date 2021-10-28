public class forj {
	public static String fenceF(int posts) {
	String result = "|";
		for(int i = 1; i < posts; i ++) {
			result += "--|";
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(fenceF(1));
	}
}
