package program.string;
//str-->"ty08dp&uih*y";
//o/p-->"yh08iu&pdy*t";
public class ReverseOnlyString {
	static String reverse(String str) {
		String rev="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>='a'&&c<='z'||c>='A'&&c<='Z') {
				rev=c+rev;
			}
		}
		return rev;
	}
	public static void main(String[] args) {
		String str="ty08dp&uih*y";
		String s1=reverse(str),s2="";
		int c=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				s2=s2+s1.charAt(c++);
			}
			else {
				s2=s2+str.charAt(i);
			}
		}
		System.out.println(s2);
	}
}
