
package FigureMake;

import java.util.Scanner;

public class q1303 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int width = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				width++;
				System.out.print(width + " ");
			}
			System.out.println();
		}
	}
}

/*
package FigureMake;

import java.util.Scanner;

public class q1303 { // 이중배열 사용!
	public static void main(String[] args) {
		int[][] ar;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		ar = new int[n][m];

		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ar[i][j] = num++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}
}
*/