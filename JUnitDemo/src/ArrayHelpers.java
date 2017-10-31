
public class ArrayHelpers {
	
	public static void reverse(int[] arr) {
		int size = arr.length;
		int mid = size / 2;
		int temp = 0;
		int topIndex = 0;
		for (int i = 0; i < mid; i++) {
			topIndex = size - i - 1;
			temp = arr[i];
			arr[i] = arr[topIndex];
			arr[topIndex] = temp;
		}
	}
	
	public static int maxElement(int[] arr) {
		int size = arr.length;
		int max = arr[0];
		for (int i = 0; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
}