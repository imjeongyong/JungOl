import java.util.Scanner;

public class Repeat633 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("1. Korea\n2. USA\n3. Japan\n4. China\nnumber? ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.printf("\nSeoul\n");
				System.out.println();
			} else if (num == 2) {
				System.out.printf("\nWashington\n");
				System.out.println();
			} else if (num == 3) {
				System.out.printf("\nTokyo\n");
				System.out.println();
			} else if (num == 4) {
				System.out.printf("\nBeijing\n");
				System.out.println();
			} else {
				System.out.printf("\nnone\n");
				System.out.println();
				break;
			}
		}
		sc.close();
	}
}