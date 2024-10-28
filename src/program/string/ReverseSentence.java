package program.string;

public class ReverseSentence {
	public static void main(String[] args) {
		// Rule 1-->
//			String s="hi how are you guys";
//			String s1="";
//			String[] arr=s.split(" ");
//			for(String ele:arr)
//			{
//				s1=" "+ele+s1;
//				
//			}
//			System.out.println(s1);

		// Rule 2-->
		String s = "hi how are you guys";
		String[] arr = s.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
