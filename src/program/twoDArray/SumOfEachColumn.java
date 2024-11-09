package program.twoDArray;
//Write a java program to find sum of each Columns in an array
public class SumOfEachColumn {
	public static void main(String[] args) {
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[j][i];
			}int num=0;
			System.out.println("Sum of column "+(i+num)+" is "+sum);
		}
	}
}

