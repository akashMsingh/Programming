package program.twoDArray;
//Write a java program to sort each row of the array
public class SortEachRow {
	static void sortArray(int[] arr) {
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=i;j<arr.length;j++) {
	    		if(arr[i]>arr[j]) {
	    			int temp=arr[i];
		    		arr[i]=arr[j];
		    		arr[j]=temp;
	    		}
	    	}
	    }
	}
	public static void main(String[] args) {
		int[][] arr = { { 3,2,1 }, { 4, 8, 5 }, { 7, 8, 9 } };
		for(int i=0;i<arr.length;i++) {
			sortArray(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
