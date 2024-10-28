package program.array;

import java.util.Arrays;

public class SumOfEleToRight {
	static int sumOfArry(int[]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		int sum=sumOfArry(arr);
		for(int i=0;i<arr.length;i++)
		{
			sum=sum-arr[i];
			arr[i]=sum;
		}
		System.out.println(Arrays.toString(arr));
	}
}
