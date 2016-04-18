package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RecursivePrintFigure {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("n = ");
		int number = scanner.nextInt();
		System.out.println();

		printFigure(number);
	}

	private static void printFigure(int n) {
		if (n == 0) {
			return;
		}

		char[] asterisks = new char[n];
		Arrays.fill(asterisks, '*');
		System.out.println(new String(asterisks));

		printFigure(n - 1);

		char[] hashtags = new char[n];
		Arrays.fill(hashtags, '#');
		System.out.println(new String(hashtags));
	}
}
