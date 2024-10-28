package program.array;

public class SumOfPrimeArray {
	public static boolean isPrime(int num) {
		int n=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				n++;
			}
		}
		return n==2;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}
