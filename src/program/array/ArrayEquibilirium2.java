package program.array;

public class ArrayEquibilirium2 {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,1,1};
		int Lsum=0,Rsum=0;
		int leng=arr.length/2;
		for(int i=0;i<leng;i++)
		{
			Lsum=Lsum+arr[i];
		}
		for(int i=leng;i<arr.length;i++)
		{
			Rsum=Rsum+arr[i];
		}
		System.out.println(Lsum==Rsum?"ArrayEquibilirium":"Not ArrayEquibilirum");
	}
}
