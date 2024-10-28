package program.array;

public class FindDuplicateArray {
	public static int maximum(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])max=arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,5,5,6};
		int max=maximum(arr);
		int leng=0;
		if(arr.length<max) {
			 leng=max;
		}else {
			 leng=arr.length;
		}
		int[] temp=new int[leng+1];
		for(int i=0;i<arr.length;i++) {
			temp[arr[i]]++;
			if(temp[arr[i]]==2) {
				System.out.println(arr[i]);
			}
		}
	}
}
