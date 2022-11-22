package q570;

public class Main {
	public static void main(String[] args) {
		int[][] ar = new int[5][5];

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 5; j++) {
				ar[i][j] = 1;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				ar[i][j] = 1;
			}
		}

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				ar[i][j] = ar[i][j - 1] + ar[i - 1][j];
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}