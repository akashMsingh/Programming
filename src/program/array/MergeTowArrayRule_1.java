package program.array;

public class MergeTowArrayRule_1 {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {10,20,30,40,50};
		int length=arr1.length+arr2.length;
		int[] arr3=new int[length];
		int num=0;
		for(int i=0;i<arr1.length;i++) {
			arr3[num++]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[num++]=arr2[i];
		}
		for(int i:arr3) {
			System.out.print(i+" ");
		}
	}
}
