package practice5;

import java.util.Scanner;

interface Stack {
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack {
	private int len, capa;
	String [] word = new String[100];
	void putLen(int len) {
		this.len = len;
	}
	void putCapacity(int capa) {
		this.capa = capa;
	}
	public int length() {
		return len;
	}
	public int capacity() {
		return capa;
	}
	public String pop() {
			return word[length()];
	}
	public boolean push(String val) {
		if(length()<capacity()) {
			word[length()] = val;
			putLen(length()+1);
			return true;
		}
		else {
			System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			return false;	
		}
	}
}

public class ex9 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		StringStack ss = new StringStack();
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int size = scanner.nextInt();
		ss.putCapacity(size);
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			String in = scanner.next();
			if(in.equals("�׸�"))
				break;
			ss.push(in);
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		for(int j=0; j<size; j++) {
			ss.putLen(ss.length()-1);
			System.out.print(ss.pop() + " ");
			
		}

	}

}
