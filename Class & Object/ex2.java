package practice4;
import java.util.Scanner;

class Grade {
	private int math, science, english;
	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	int average() {
		return (this.math + this.science + this.english)/3;
	}
}

public class ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		
		scanner.close();

	}

}
