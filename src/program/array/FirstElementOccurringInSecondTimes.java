package program.array;

public class FirstElementOccurringInSecondTimes {
	static int maximum(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {1,7,8,3,4,8,7};
		int k=2;
		int max=maximum(arr);
		int[] temp=new int[max+1];
		for(int i=0;i<arr.length;i++) {
			temp[arr[i]]++;
			if(temp[arr[i]]==k) {
				System.out.println(arr[i]);break;
			}
		}
	}
}
