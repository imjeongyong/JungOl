import java.util.Scanner;

public class Operator520 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 입력받겠다 -> 스캐너 사용
		String input = scanner.nextLine(); // 한줄 통채로 입력받겠다
		scanner.close();

		int num = Integer.parseInt(input); // 입력받은 문자를 정수로 변환

		System.out.println(num++);
		System.out.println(++num);
	}
}

/*
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();    // 정수형으로 입력받겠다 -> 입력받은 문자를 정수로 변환하는 코드가 필요없음
      sc.close();
      
      System.out.println(a++);
      System.out.println(++a);
      
   }
}
*/


/*
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      String input = scanner.nextLine();
      scanner.close();
      
      int i = Integer.parseInt(input);
      
      int sum1 = i++;
      int sum2 = ++i;
      
      System.out.println(sum1);
      System.out.println(sum2);
      
      
   }
}
*/