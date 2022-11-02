import java.util.Scanner;

class ScannerEx{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
//		String input = scanner.next();                           <- 공백이 나오기 전까지만 저장
//		int input = scanner.nextInt();                           <- 정수값 저장
//		double input = scanner.nextDouble();                     <- 실수값 저장
//		char intput = scanner.next().charAt(0);                  <- 맨앞 글자 저장(nextChar 없음)
		
		scanner.close();                                          // 스캔을 종료해서 경고창 제거
		
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 : " + input);
		System.out.printf("num = %d\n " , num);
	}
}