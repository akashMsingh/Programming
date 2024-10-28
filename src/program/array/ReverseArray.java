package program.array;

public class ReverseArray {
	static void reverse(int[] arr) {
		int i=0,leng=arr.length-1;
		while(i<leng) {
			int temp=arr[i];
			arr[i]=arr[leng];
			arr[leng]=temp;
			i++;
			leng--;
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		reverse(arr);
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}
}
