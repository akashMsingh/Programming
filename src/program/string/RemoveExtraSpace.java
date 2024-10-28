package program.string;

public class RemoveExtraSpace {
	public static void main(String[] args) {
		String sentence="how   are      you";
		String temp="";
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' '&&sentence.charAt(i+1)==' ') {
				continue;
			}else {
				temp=temp+sentence.charAt(i);
			}
		}
		System.out.println(temp);
	}
}
