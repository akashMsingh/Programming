package program.array;

public class HappyGroup {
	public static int maximun(int[] arr) {
		int max=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int sumOf(int[] arr,int max) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=max)sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr= {4,3,2,1,15,2,3};
		int max=maximun(arr);
		int sum=sumOf(arr,max);
		System.out.println(sum==max?"HappyGroup":"UnHappyGroup");
	}
}
