package program.string;

public class SwapCharAccendingOrderInString {
	static void accendingOrder(char[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		String str="apple";
		char[] arr=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i);
		}
		accendingOrder(arr);
		String s=new String(arr);
		System.out.println(s);
	}
}
