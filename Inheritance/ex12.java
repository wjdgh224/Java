package practice5;
import java.util.Scanner;

abstract class Shape2 {
	private Shape2 next;
	public Shape2() { next = null; }
	public void setNext(Shape2 obj) { next = obj; }
	public Shape2 getNext() { return next; }
	public abstract void draw();
}

class Line2 extends Shape2 {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect2 extends Shape2 {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle2 extends Shape2 {
	public void draw() {
		System.out.println("Circle");
	}
}

public class ex12 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		Shape2 start=null, last=null, obj=null;
		int cnt = 0;
		while(true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			int sel = scanner.nextInt();
			if(sel==1) {
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int num = scanner.nextInt();
				if(cnt==0) {
					if(num==1) {
						start = new Line2();
						last = start;
						cnt++;
					}
					else if(num==2) {
						start = new Rect2();
						last = start;
						cnt++;
					}
					else {
						start = new Circle2();
						last = start;
						cnt++;
					}
				}
				else {
					if(num==1) {
						obj = new Line2();
						last.setNext(obj);
						last = obj;
						cnt++;
					}
					else if(num==2) {
						obj = new Rect2();
						last.setNext(obj);
						last = obj;
						cnt++;
					}
					else {
						obj = new Circle2();
						last.setNext(obj);
						last = obj;
						cnt++;
					}
				}
			}
			else if(sel==2) {
				System.out.print("������ ������ ��ġ>>");
				int pos = scanner.nextInt();
				if(pos > cnt) System.out.println("������ �� �����ϴ�.");
				Shape2 pre=start, post;
				for(int i=0; i<pos-2; i++) {
					pre = pre.getNext();
				}
				post = pre.getNext();

				if(pos==1) {
					if(start.getNext()!=null) {
						start = start.getNext(); cnt--;
					}
					else {
						start = null; cnt--;
					}
				}
				else {
					pre.setNext(post.getNext()); cnt--;
				}
				//pre.setNext(post.getNext());
				
				
			}
			else if(sel==3) {
				Shape2 p = start;
				while(p!=null) {
					p.draw();
					p = p.getNext();
				}
			}
			else {
				System.out.println("beauty�� �����մϴ�.");
				break;
			}
		}
	}
}