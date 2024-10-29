package program.number;

public class PerfectSquireNumber {
	public static void main(String[] args) {
		int num=11;
		boolean flag=false;
		for(int i=1;i<=num;i++)
		{
			if(i*i==num)
			{
				flag=true;break;
			}
		}
		System.out.println(flag==true?"Perfect Squire Number":"Not Perfect Squire Number");
	}
}
