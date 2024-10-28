package program.string;

public class ConvertCharIntoString {
	public static void main(String[] args) {
		char[] arr = { 'h', 'e', 'l', 'l', 'o' };
		// ===========first rule=================
//		String str="";
//		for(int i=0;i<arr.length;i++)
//		{
//			str=str+arr[i];
//		}
	// ==============second rule==============
	String str = new String(arr);
	System.out.println(str);
	}
}
