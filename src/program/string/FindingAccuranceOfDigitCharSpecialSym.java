package program.string;

public class FindingAccuranceOfDigitCharSpecialSym {
	public static void main(String[] args) {
		String s="Ak@123";
		int d=0,ch=0,sc=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z'||c>='A'&&c<='Z') {
				ch++;
			}
			else if(c>='0'&&c<='9') {
				d++;
			}
			else {
				sc++;
			}
		}
		System.out.println("Number of Alphabets is: "+ch);
		System.out.println("Number of Digits is: "+d);
		System.out.println("Number of Special Symbol is: "+sc);
	}
}
