package program.string;

public class ReverseOnlyEvenPositionWord {
	static String reverse(String word) {
		String rev="";
		for(int i=0;i<word.length();i++) {
			rev=word.charAt(i)+rev;
		}
		return rev;
	}
	public static void main(String[] args) {
		String str="hello hi how are you guys";
		String s="";
		int count=1;
		String[] words=str.split("\s+");
		for(String word:words) {
			if(count%2==0) {
				s=s+reverse(word)+" ";
			}
			else {
				s=s+word+" ";
			}
			count++;
		}
		System.out.println(s);
	}
}
