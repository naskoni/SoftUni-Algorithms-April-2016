package combinatorial;

import java.util.Arrays;

public class VariationsGeneratorRecursive {

	private VariationsGeneratorRecursive() {
	}

	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		int[] arr = new int[k];
		generateVariations(arr, 0, n, k);
	}

	public static void generateVariations(int[] arr, int index, int n, int k) {
		if (index >= k) {
			System.out.println(Arrays.toString(arr));
		} else {
			for (int i = 0; i < n; i++) {
				arr[index] = i;
				generateVariations(arr, index + 1, n, k);
			}
		}
	}
}
