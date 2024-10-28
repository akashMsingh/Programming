package program.string;
//str="aabbbccabb";
//o/p-"a2b3c2a1b2"
public class CountRepetedOfCharRule_1 {
	public static void main(String[] args) {
		String str="aabbbccabb";
		for(int i=0;i<str.length();i++) {
			int count=0;
			char ch=str.charAt(i);
			while(i<str.length()&&ch==str.charAt(i)) {
				count++;
				i++;
			}
			i-=1;
			System.out.print(str.charAt(i)+""+count);
		}
	}
}
