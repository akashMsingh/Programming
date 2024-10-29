package program.number;

public class MakeBigNumber {
	static void makeBigNumber(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int num=176545;
		String s=num+"";
		int[] arr=new int[s.length()];
		int i=0;
		while(num>0)
		{
			int rem=num%10;
			arr[i]=rem;
			i++;
			num=num/10;
		}
		makeBigNumber(arr);
		for(int ele:arr)
		{
			System.out.print(ele);
		}
	}
}
