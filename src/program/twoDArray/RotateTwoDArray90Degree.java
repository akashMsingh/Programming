package program.twoDArray;

import java.util.Scanner;

public class RotateTwoDArray90Degree {
	static void reverse(int[] arr) {
		int i=0,j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Enter the col");
		int col=sc.nextInt();
		int[][] arr1=new int[row][col];
		System.out.println("Enter the element of array: ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		int[][] arr2=new int[row][col];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j]=arr1[j][i];
			}
		}
		for(int i=0;i<arr2.length;i++) {
			reverse(arr2[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
