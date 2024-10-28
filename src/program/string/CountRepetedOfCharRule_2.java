package program.string;

public class CountRepetedOfCharRule_2 {
	public static void main(String[] args) {
		String S="aabbaaaccggddjjjj";
		String s=S+" ";
		String str="";
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			}
			else {
				str=str+s.charAt(i)+count;
				count=1;
			}
		}
		System.out.println(str);
	}
}
