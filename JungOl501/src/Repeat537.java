
import java.util.Scanner;

public class Repeat537 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

//		System.out.println(n);

		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum = sum + i; 
			i++; // <- 두줄 합치면 sum += i++;
		}
		
		System.out.println(sum);
	}
}


/*
import java.util.Scanner;

public class Repeat537 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

//		System.out.println(n);

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i; // <- sum += i; 를 더 많이씀
		}
		System.out.println(sum);
	}
}
*/

/*
import java.util.Scanner;

public class Repeat537 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

//		System.out.println(n);

		int sum = 0;
		int i = 1;
		do {

//			sum = sum + i;
//			i++;

			sum += i++;

		} while (i <= n);
		System.out.println(sum);
	}
}
*/