import java.util.Scanner;

public class Operator519 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

//		System.out.println(a);
//		System.out.println(b);

		int x = a + 100;
		int y = b % 10;

		System.out.print(x + " ");
		System.out.println(y);
	}
}



/* 모범답안
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
//		Scanner sc;                       
//		sc = new Scanner(System.in);     	두 코드를 한줄로 쓰면 ->
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
//		System.out.print(n1);            단계별로 변수 선언이 잘됬는지 항상 확인!!!
//		System.out.print(" ");
//		System.out.print(n2);
		
		n1 = n1 + 100;
		n2 = n2 % 10;
		
		System.out.print(n1 + " " + n2);
	}
}
*/