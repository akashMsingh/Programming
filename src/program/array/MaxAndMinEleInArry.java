package program.array;

public class MaxAndMinEleInArry {
	public static void main(String[] args) {
		int[] arr= {4,5,1,6,7,8};
		int min=arr[0],max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])max=arr[i];
			if(min>arr[i])min=arr[i];
		}
		System.out.println("Maximun Element: "+max+"\nMinimum Element: "+min);
	}
}
