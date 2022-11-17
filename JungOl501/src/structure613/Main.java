package structure613;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		st.Name = sc.next();
		st.School = sc.next();
		st.Grade = sc.nextInt();
		sc.close();

		System.out.println("Name : " + st.Name);
		System.out.println("School : " + st.School);
		System.out.println("Grade : " + st.Grade);
	}
}

class Student {
	String Name;
	String School;
	int Grade;
}