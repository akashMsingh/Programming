package program.string;

public class PalindromicSubstrings {
	static boolean reverse(String s) {
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		return s.equals(rev);
	}
	public static void main(String[] args) {
		String s = "abbahjhcd";
		for(int i=0;i<s.length();i++) {
			String str="";
			str=str+s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				str=str+s.charAt(j);
				if(reverse(str)) {
					System.out.println(str);
				}
			}
		}
	}
}
