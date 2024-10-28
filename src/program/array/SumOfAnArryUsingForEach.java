package program.array;

public class SumOfAnArryUsingForEach {
	public static int sumOfArray(int[] arr) {
		int sum=0;
		for(int ele:arr) {
			sum=sum+ele;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[]arr= {9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println(sumOfArray(arr));
	}
}
