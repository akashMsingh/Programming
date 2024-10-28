package program.string;

import java.util.HashSet;

public class CountWordStartWithVowel {
	public static void main(String[] args) {
		String sentence = "Ram is a god";
		int count=countOfWords(sentence);
		System.out.println("Number of words start with vowel: "+count);
	}
	public static int countOfWords(String str) {
		String[] words=str.split("\\s+");
		int count=0;
		String vowel="aeiouAEIOU";
		HashSet<Character> h1=new HashSet<Character>();
		for(char c:vowel.toCharArray()) {
			h1.add(c);
		}
		for(String word:words) {
			if(h1.contains(word.charAt(0))) {
				count++;
			}
		}
		return count;
	}
}
