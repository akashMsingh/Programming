package program.string;

public class ReverseString {
	public static String reverse(String str) {
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		return rev;
	}
	public static void main(String[] args) {
		String str="hello";
		System.out.println(reverse(str));
	}
}
