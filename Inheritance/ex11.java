package practice5;

import java.util.Scanner;

abstract class Calc {
	int a, b;
	void setValue(int a, int b) {
		this.a = a; this.b = b;
	}
	abstract int calculate();
}

class Add extends Calc {
	int calculate() {
		return a+b;
	}
}

class Sub extends Calc {
	int calculate() {
		return a-b;
	}
}

class Mul extends Calc {
	int calculate() {
		return a*b;
	}
}

class Div extends Calc {
	int calculate() {
		return a/b;
	}
}

public class ex11 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char c = scanner.next().charAt(0);
		if(c=='+') {
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
		}
		else if(c=='-') {
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		}
		else if(c=='*') {
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		}
		else {
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
		}

	}

}
