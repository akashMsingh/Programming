package program.array;

public class MergeTwoArrayRule_2 {
	public static int[] sort(int[] x, int[] y) {
		int i = 0, j = 0, k = 0;
		int[] z = new int[x.length + y.length];
		while (i < x.length && j < y.length) {
			if (x[i] < y[j]) {
				z[k++] = x[i++];
			}
			else{
				z[k++] = y[j++];
			}
		}
		while(i<x.length) {
			z[k++]=x[i++];
		}
		while(j<y.length) {
			z[k++]=y[j++];
		}
		return z;
	}

	public static void main(String[] args) {
		int[] arr1= {1,3,4,5,6,7,8};
		int[] arr2= {9,10,22,45,76,88};
		int[] arr3=sort(arr1, arr2);
		for(int ele:arr3) {
			System.out.print(ele+" ");
		}
	}
}
