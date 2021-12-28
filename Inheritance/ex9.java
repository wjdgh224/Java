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
			System.out.println("스택이 꽉 차서 푸시 불가!");
			return false;	
		}
	}
}

public class ex9 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		StringStack ss = new StringStack();
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = scanner.nextInt();
		ss.putCapacity(size);
		while(true) {
			System.out.print("문자열 입력 >> ");
			String in = scanner.next();
			if(in.equals("그만"))
				break;
			ss.push(in);
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for(int j=0; j<size; j++) {
			ss.putLen(ss.length()-1);
			System.out.print(ss.pop() + " ");
			
		}

	}

}
