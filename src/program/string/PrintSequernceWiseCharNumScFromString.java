package program.string;

public class PrintSequernceWiseCharNumScFromString {
	public static void main(String[] args) {
		String str = "ahd1er@1r2";
		String a = "", d = "", sc = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				a = a + c;
			} else if (c >= '0' && c <= '9') {
				d = d + c;
			} else {
				sc = sc + c;
			}
		}
		System.out.println(a + d + sc);
	}
}
