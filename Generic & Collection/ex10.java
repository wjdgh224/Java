package practice7;
import java.util.*;

class Shape {
	public void print() { System.out.println("Shape"); }
}

class Line extends Shape {
	public void print() { System.out.println("Line"); }
}

class Rect  extends Shape{
	public void print() { System.out.println("Rect"); }
}

class Circle extends Shape {
	public void print() { System.out.println("Circle"); }
}

public class ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Shape> v = new Vector<Shape>();
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		while(true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			int num = scanner.nextInt();
			if(num==4) {
				System.out.println("beauty�� �����մϴ�.");
				break;
			}
			else if(num==1) {
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int s = scanner.nextInt();
				if(s==1)
					v.add(new Line());
				else if(s==2)
					v.add(new Rect());
				else
					v.add(new Circle());
			}
			else if(num==2) {
				System.out.print("������ ������ ��ġ>>");
				int pos = scanner.nextInt();
				if(pos>v.size())
					System.out.println("������ �� �����ϴ�.");
				else
					v.remove(pos-1);
			}
			else {
				for(int i=0; i<v.size(); i++)
					v.get(i).print();
			}
		
		}
		
		scanner.close();
	}

}
