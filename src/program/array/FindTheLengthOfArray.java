package program.array;

//find the length of array without using any pre-defined function or length iteration 
public class FindTheLengthOfArray {
	public static void main(String[] args) {
		int arr[] = { '1', '2', '3', '4', '5', '6' };
		int length=0;
		try {
			while(true) {
				@SuppressWarnings("unused")
				int val=arr[length];
				length++;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
		}
		System.out.println("Length of an Array: "+length);
		
	}
}
