package program.string;

public class ArrangeCharNumberSpecialChar {
	public static void main(String[] args) {
		String s = "gf45#2dsMgn&89";
		String a="",n="",sc="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				a=a+s.charAt(i);
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				n=n+s.charAt(i);
			}
			else {
				sc=sc+s.charAt(i);
			}
		}
		System.out.println(a+n+sc);
	}
}
