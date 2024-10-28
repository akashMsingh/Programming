package program.string;

public class CharacterAccuranceRule_3 {
	public static void main(String[] args) {
		String s="hello";
		int[] arr=new int[125];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.println((char)i+"-"+arr[i]);
			}
		}
	}
}
