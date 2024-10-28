package program.array;

import java.util.Arrays;

public class SortedInDesendingWise {
	public static void sortDesending(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[]arr= {7,4,1,3,6,2,9,8,5};
		sortDesending(arr);
		System.out.println(Arrays.toString(arr));
	}
}
