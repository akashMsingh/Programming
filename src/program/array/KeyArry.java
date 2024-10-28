package program.array;

public class KeyArry {
	public static void main(String[] args) {
		int [] arr= {4,3,2,1,15,2,3};
		int key=15;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Position of KeyArry: "+(i+1));break;
			}
		}
	}
}
