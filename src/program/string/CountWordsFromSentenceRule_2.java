package program.string;

public class CountWordsFromSentenceRule_2 {
	public static void main(String[] args) {
		String s="Hi i'm Akash  Kumar     Singh";
		String[] words=s.split("\\s+");
		int count=0;
		for(@SuppressWarnings("unused") String word:words) {
			count++;
		}
		System.out.println("Count of words is: "+count);
	}
}
