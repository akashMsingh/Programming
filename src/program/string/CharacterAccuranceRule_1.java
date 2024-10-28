package program.string;

public class CharacterAccuranceRule_1 {
	public static void main(String[] args) {
		String str="hello";
		char[] ch1=str.toCharArray();
		char[] ch2=str.toCharArray();
		for(int i=0;i<ch1.length;i++) {
			int n=0;
			for(int j=0;j<ch2.length;j++) {
				if(ch1[i]==ch2[j]) {
					n++;
					ch2[j]='\0';
				}
			}
			if(n>0)System.out.println(ch1[i]+"-"+n);
		}
	}
}
