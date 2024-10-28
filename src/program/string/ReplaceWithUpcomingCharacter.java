package program.string;

public class ReplaceWithUpcomingCharacter {
	public static void main(String[] args) {
		String str="NanDi";
		String s="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='z') {
				c='a';
			}
			else if(c=='Z') {
				c='A';
			}
			else {
				c++;
			}
			s=s+c;
		}
		System.out.println(s);
	}
}
