package program.number;

public class Find_nthPrimeNumber {
	public static boolean isPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count==2;
	}
	public static void main(String[] args) {
		int num=5;
		int c=0;
		for(int i = 1;;i++)
		{
			if(isPrime(i)) {
				c++;
			}
			if(num==c)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
