package program.array;

public class ProductExcludingCurrent {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int i = 2; // Index to skip (for example, index 2 corresponds to number 3)
        int mult = 1;
        for (int j = 0; j < arr.length; j++) {
            if (j != i) {  // Skip the element at index i
                mult= mult*arr[j];
            }
        }

        System.out.println("Product of array elements excluding arr[" + i + "] is: " + mult);
    }
}
