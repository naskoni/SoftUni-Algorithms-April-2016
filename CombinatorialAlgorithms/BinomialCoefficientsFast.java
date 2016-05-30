package combinatorial;

public class BinomialCoefficientsFast {

	private static final int MAX = 100;
	private static long[][] binomialCoefficients = new long[MAX][MAX];

	private BinomialCoefficientsFast() {
	}

	public static void main(String[] args) {
		System.out.println(calcBinomialCoefficient(4, 2));
		System.out.println(calcBinomialCoefficient(10, 4));
		System.out.println(calcBinomialCoefficient(13, 7));
		System.out.println(calcBinomialCoefficient(26, 13));
		System.out.println(calcBinomialCoefficient(70, 25));
	}

	public static long calcBinomialCoefficient(int n, int k) {
		if (k > n) {
			return 0;
		}

		if (k == 0 || k == n) {
			return 1;
		}

		if (binomialCoefficients[n][k] == 0) {
			binomialCoefficients[n][k] = calcBinomialCoefficient(n - 1, k - 1) + calcBinomialCoefficient(n - 1, k);

		}

		return binomialCoefficients[n - 1][k - 1] + binomialCoefficients[n - 1][k];

	}

}
