package rePeat548;

public class Main {
	public static void main(String[] args) {
		for (int i = 2; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.printf("%s * %s = %2s   ", i, j, i * j);
			}
			System.out.println();
		}
	}
}