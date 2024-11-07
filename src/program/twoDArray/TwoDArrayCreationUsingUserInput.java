package program.twoDArray;

import java.util.Scanner;

public class TwoDArrayCreationUsingUserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ther size of row: ");
		int row=sc.nextInt();
		System.out.println("Enter the size of column");
		int column=sc.nextInt();
		int[][]  arr=new int[row][column];
		System.out.println("Enter the element of Array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
