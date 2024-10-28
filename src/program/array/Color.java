package program.array;

public class Color {
	public static void main(String[] args) {
		String[] arr = { "red", "black", "white", "green", "yellow", "orange", "purple", "brown" };
		int n = (int) (Math.random() * arr.length);
		System.out.println(arr[n]);
	}
}
