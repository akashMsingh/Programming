package program.twoDArray;
//Write a java program to sort each column of the array
public class SortEachColumn {
	 static void sortColumn(int [][] arr) {
	      for (int col=0;col<arr[0].length;col++) { 
	         for (int row=0; row<arr.length;row++){
	            for (int k=0; k<arr.length-row-1; k++) {
	               if (arr[k][col] > arr[k + 1][col]) {
	                  int t = arr[k][col]; 
	                  arr[k][col] = arr[k + 1][col];
	                  arr[k + 1][col] = t;
	               }
	            }
	         }
	      }
	 }
	public static void main(String[] args) {
		int[][] arr = { { 3,2,1 }, { 4, 8, 5 }, { 7, 4, 9 } };
		sortColumn(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
