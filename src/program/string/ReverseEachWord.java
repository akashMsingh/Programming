package program.string;

public class ReverseEachWord {
	static String reverse(String word) {
		String str="";
		for(int i=0;i<word.length();i++) {
			str=word.charAt(i)+str;
		}
		return str;
	}
	public static void main(String[] args) {
		String str="Akash Kumar    Singh";
		String s="";
		String[] words=str.split("\s+");
		for(String word:words) {
//			System.out.print(reverse(word)+" ");
			s=s+reverse(word)+" ";
		}
		System.out.println(s);
	}
}
