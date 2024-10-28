package program.array;

public class SecondMaxElementRule_2 {
	public static void main(String[] args) {
		int arr[]= {9,0,8,1,2,3,10,4,5,9,6,6};
		int max1=0;
		int max2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			else if(max2<max1 && max2<arr[i]) {
				max2=arr[i];
			}
			
		}
		System.out.println("First Max: "+max1);
		System.out.println("Second Max: "+max2);
	}
}
