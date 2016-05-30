package combinatorial;

public class BinomialCoefficientsSlow {

	private BinomialCoefficientsSlow() {
	}

	public static void main(String[] args) {
		System.out.println(calcBinomialCoefficient(4, 2));
		System.out.println(calcBinomialCoefficient(10, 4));
		System.out.println(calcBinomialCoefficient(13, 7));
		System.out.println(calcBinomialCoefficient(26, 13));
		System.out.println(calcBinomialCoefficient(70, 25)); // requires too
																// many time
	}

	public static long calcBinomialCoefficient(int n, int k) {
		if (k > n) {
			return 0;
		}

		if (k == 0 || k == n) {
			return 1;
		}

		return calcBinomialCoefficient(n - 1, k - 1) + calcBinomialCoefficient(n - 1, k);
	}

}
