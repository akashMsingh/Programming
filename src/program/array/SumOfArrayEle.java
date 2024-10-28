package program.array;

public class SumOfArrayEle {
	public static int sumOfArray(int[]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[]arr= {9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println(sumOfArray(arr));
	}
}
