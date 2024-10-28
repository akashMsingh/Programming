package program.array;

public class ArrayEquibilirium {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 2 };
		int Lsum=0,Rsum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr.length/2>i) {
				Lsum=Lsum+arr[i];
			}
			else {
				Rsum=Rsum+arr[i];
			}
		}
		if(Lsum==Rsum) {
			System.out.println("Array Equibilirium");
		}
		else {
			System.out.println("Not Array Equibilirium");
		}
	}
}
