package program.array;

public class PolindromeArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,3,2,1};
		int i=0,leng=arr.length-1;
		boolean flag=true;
		while(i<leng) {
			if(arr[i]==arr[leng]) {
				i++;
				leng--;
			}
			else {
				flag=false;break;
			}
		}
		System.out.println(flag==true?"PolindromeArray":"NotPolindromeArray");
	}
}
