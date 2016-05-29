package combinatorial;

import java.util.Arrays;

public class VariationsGeneratorIterative {

	private VariationsGeneratorIterative() {
	}

	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		int[] arr = new int[k];
		generateVariations(arr, n, k);
	}

	public static void generateVariations(int[] arr, int n, int k) {
		while (true) {
			System.out.println(Arrays.toString(arr));
			int digitIndex = k - 1;
			while (digitIndex >= 0 && arr[digitIndex] == n - 1) {
				digitIndex--;
			}

			if (digitIndex < 0) {
				break;
			}

			arr[digitIndex]++;
			for (int i = digitIndex + 1; i < k; i++) {
				arr[i] = 0;
			}
		}
	}
}
