package combinatorial;

import java.util.Arrays;

public class CombinationsGenerator {

	private CombinationsGenerator() {
	}

	public static void main(String[] args) {
		int n = 4;
		int startNum = 1;
		int endNum = 9;

		int[] arr = new int[n];
		genCombs(arr, 0, startNum, endNum);
	}

	public static void genCombs(int[] arr, int index, int startNum, int endNum) {
		if (index >= arr.length) {
			System.out.println(Arrays.toString(arr));
		} else {
			for (int i = startNum; i <= endNum; i++) {
				arr[index] = i;
				genCombs(arr, index + 1, i + 1, endNum);
			}
		}
	}
}
