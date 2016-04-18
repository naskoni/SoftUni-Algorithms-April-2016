package recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveFactorial {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("n = ");
		int number = scanner.nextInt();

		BigInteger factorial = factorial(number);
		System.out.printf("%d! = %d", number, factorial);
	}

	private static BigInteger factorial(int number) {
		if (number == 1) {
			return BigInteger.valueOf(1);
		}

		return factorial(number - 1).multiply(BigInteger.valueOf(number));
	}
}
