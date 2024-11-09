package program.twoDArray;
// Write a java program to find sum of each row in an array
public class SumOfEachRow {
	public static void main(String[] args) {
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}int num=1;
			System.out.println("sum of row "+(num+i)+" is "+sum);
		}
	}
}
