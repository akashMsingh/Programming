package program.string;

public class AddingNumberFromSentence {
	public static void main(String[] args) {
		String str = "hello 100 hi bye 200 welcome 23";
		int sum=0;
		String[] words=str.split(" ");
		for(String word: words) {
			try {
				sum=sum+Integer.parseInt(word);
			}catch(NumberFormatException e) {
				
			}
		}
		System.out.println(sum);
	}
}
