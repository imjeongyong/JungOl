package structure613;

import java.util.Scanner;

class Studentt {
	private String name;
	private String school;
	private int grade;

	public Studentt(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("school : " + school);
		System.out.println("grade : " + grade);
	}
}

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();

		Studentt s = new Studentt(name, school, grade);
		s.print();
	}
}