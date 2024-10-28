package program.string;

public class ReverseHalfOfWord {
	public static void main(String[] args) {
		String str="Akash";
		int len=str.length()/2;
		String s1="",s2="";
		for(int i=0;i<str.length();i++) {
			if(i>=len)s2=str.charAt(i)+s2;
			else s1=s1+str.charAt(i);
		}
		System.out.println(s1+s2);
	}
}
