package program.string;

public class Anagram {
	public static String sort(String str) {
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		String s1="hello";
		String s2="olleh";
		String s3=sort(s1);
		String s4=sort(s2);
		if(s3.equals(s4)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not a Anagram");
		}
	}
}
