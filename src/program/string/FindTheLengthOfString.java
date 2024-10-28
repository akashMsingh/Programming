package program.string;

public class FindTheLengthOfString {
	public static void main(String[] args) {
		String s="hello";
		int leng=0;
		try {
			while(true) {
				@SuppressWarnings("unused")
				char c=s.charAt(leng);
				leng++;
			}
		}catch(StringIndexOutOfBoundsException e) {
		}
		System.out.println("Length of Words: "+leng);
	}
}
