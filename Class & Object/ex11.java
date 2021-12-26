package practice4;

import java.util.Scanner;

class Add {
	int a, b;
	void setValue(int a, int b) {
		this.a = a; this.b = b;
	}
	int calculate() {
		return a+b;
	}
}

class Sub {
	int a, b;
	void setValue(int a, int b) {
		this.a = a; this.b = b;
	}
	int calculate() {
		return a-b;
	}
}

class Mul {
	int a, b;
	void setValue(int a, int b) {
		this.a = a; this.b = b;
	}
	int calculate() {
		return a*b;
	}
}

class Div {
	int a, b;
	void setValue(int a, int b) {
		this.a = a; this.b = b;
	}
	int calculate() {
		return a/b;
	}
}

public class ex11 {
	Scanner scanner = new Scanner(System.in);
	
	void run() {
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char c = scanner.next().charAt(0);
		switch(c) {
			case '+':
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
				break;
			case '-':
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(sub.calculate());
				break;
			case '*':
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(mul.calculate());
				break;
			case '/':
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(div.calculate());
				break;
		}
	}
	public static void main(String[] args) {
		ex11 e = new ex11();
		e.run();

	}

}
