package program.string;

public class PalindromeString {
	public static String reverse(String str) {
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		return rev;
	}
	public static void main(String[] args) {
		String str="Level";
		String rev=reverse(str);
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("PalindromeString");
		}else {
			System.out.println("Not PalindromeString");
		}
	}
}
