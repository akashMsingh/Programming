package program.number;

public class FibonaccciSeries {
	public static void main(String[] args) {
		int num=5;
		int n1=0;
		int n2=1;
		int sum=0;
		while(num>0)
		{
			System.out.print(n1+" ");
			sum=n1+n2;
			n1=n2;
			n2=sum;
			num--;
		}
	}
}
