package program.number;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int bin=111;
		String str=""+bin;
		int k=1;
		int sum=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			sum=sum+((str.charAt(i)-48)*k);
			k=k*2;
		}
		System.out.println(sum);
	}
}

