package program.string;

import java.util.LinkedHashMap;

public class CharacterAccuranceRule_2 {
	public static void main(String[] args) {
		String s="hello";
		LinkedHashMap<Character, Integer> m1=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			if(m1.containsKey(s.charAt(i))) {
				m1.put(s.charAt(i), m1.get(s.charAt(i))+1);
			}
			else {
				m1.put(s.charAt(i), 1);
			}
		}
		for(char c:m1.keySet()) {
			System.out.println(c+"-"+m1.get(c));
		}
	}
}
