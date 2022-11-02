import java.util.Scanner;

public class Operator518 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int result1 = a + b + c;
		int result2 = (a + b + c) / 3;

		System.out.println("sum : " + result1);
		System.out.println("avg : " + result2);
	}
}

/* 모범답안
import java.util.Scanner;

public class Operator518 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		

		int result1 = a + b + c;
		int result2 = result / 3; <-이부분!!

		System.out.println("sum : " + result1);
		System.out.println("avg : " + result2);
	}
}
*/



/* 평균 소숫점자리까지 구하는 코드
import java.util.Scanner;

public class Operator518 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		

		int result1 = a + b + c;
		double result2 = (double)result / 3; <- int 타입 대신 double 타입 선언, int 타입을 double 타입으로 형 변환

		System.out.println("sum : " + result1);
		System.out.println("avg : " + result2);
		System.out.printf("avg : %.3f\n", avg); <- 소숫점 자릿수 컨트롤(3자리 까지만)
	}
}
*/