import java.util.Scanner;

public class String596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[100];

		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}

		int n = sc.nextInt();
		for (int j = n; j >= 0; j--) {
			System.out.print(str[j]);
		}
		sc.close();
	}
}