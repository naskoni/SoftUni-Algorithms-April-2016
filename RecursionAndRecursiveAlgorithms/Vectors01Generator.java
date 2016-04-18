package recursion;

import java.util.Scanner;

public class Vectors01Generator {
	
	private static int counter;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("n = ");
		int number = scanner.nextInt();
		System.out.println();

		int[] vector = new int[number];

		Gen01(number - 1, vector);
		System.out.println(counter);
	}

	private static void Gen01(int index, int[] vector) {
		if (index == -1) {
			print(vector);
			return;
		}
		
		counter++;

		for (int i = 0; i <= 1; i++) {
			vector[index] = i;
			Gen01(index - 1, vector);
		}
	}

	private static void print(int[] vector) {
		for (int i : vector) {
			System.out.printf("%d ", i);
		}

		System.out.println();
	}
}
