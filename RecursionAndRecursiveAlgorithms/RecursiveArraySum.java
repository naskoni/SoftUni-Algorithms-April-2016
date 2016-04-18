package recursion;

public class RecursiveArraySum {
	
	private RecursiveArraySum() {		
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int sum = findSum(arr, 0);
		System.out.println(sum);
	}

	private static int findSum(int[] arr, int index) {
		if (index == arr.length) {
			return 0;
		}

		return arr[index] + findSum(arr, index + 1);
	}
}
