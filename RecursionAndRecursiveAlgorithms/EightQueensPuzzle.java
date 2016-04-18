package recursion;

import java.util.HashSet;
import java.util.Set;

public class EightQueensPuzzle {

	private static final int SIZE = 8;
	private static boolean[][] chessboard = new boolean[SIZE][SIZE];
	private static Set<Integer> attackedColumns = new HashSet<>();
	private static Set<Integer> attackedLeftDiagonals = new HashSet<>();
	private static Set<Integer> attackedRightDiagonals = new HashSet<>();

	private static int solutionsFound = 0;

	private EightQueensPuzzle() {
	}

	public static void main(String[] args) {
		putQueens(0);
		System.out.println(solutionsFound);
	}

	private static void putQueens(int row) {
		if (row == SIZE) {
			printSolution();
		} else {
			for (int col = 0; col < SIZE; col++) {
				if (canPlaceQueen(row, col)) {
					markAllAttackedPositions(row, col);
					putQueens(row + 1);
					unMarkAllAttackedPositions(row, col);
				}
			}
		}
	}

	private static void printSolution() {
		for (int row = 0; row < SIZE; row++) {
			for (int col = 0; col < SIZE; col++) {
				if (chessboard[row][col]) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}

		System.out.println();
		solutionsFound++;
	}

	private static void unMarkAllAttackedPositions(int row, int col) {
		attackedColumns.remove(col);
		attackedLeftDiagonals.remove(col - row);
		attackedRightDiagonals.remove(row + col);
		chessboard[row][col] = false;
	}

	private static void markAllAttackedPositions(int row, int col) {
		attackedColumns.add(col);
		attackedLeftDiagonals.add(col - row);
		attackedRightDiagonals.add(row + col);
		chessboard[row][col] = true;
	}

	private static boolean canPlaceQueen(int row, int col) {
		boolean positionOccupied = attackedColumns.contains(col) || attackedLeftDiagonals.contains(col - row)
				|| attackedRightDiagonals.contains(row + col);

		return !positionOccupied;
	}
}
