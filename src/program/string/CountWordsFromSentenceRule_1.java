package program.string;

public class CountWordsFromSentenceRule_1 {
	public static void main(String[] args) {
		String s="Hi i'm Akash  Kumar     Singh";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' '||s.length()-1==i) {
				count++;
			}
		}
		System.out.println("Count of word is: "+count);
	}
}
