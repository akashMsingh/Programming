package program.number;

public class DuckNumber {
	public static void main(String[] args) {
		int num=123045;
		int c=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem==0)
			{
				c++;break;
			}
			num=num/10;
		}
		System.out.println(c==1?"Duck Number":"Not Duck Number");
	}
}