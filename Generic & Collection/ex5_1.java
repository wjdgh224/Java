package practice7;
import java.util.*;
/*
class Student {
	private String name, dept;
	private int id;
	private double score;
	Student(String name, String dept, int id, double score) {
		this.name = name; this.dept = dept;
		this.id = id; this.score = score;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getId() {
		return id;
	}
	public double getScore() {
		return score;
	}
}

public class ex5_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> al = new ArrayList<Student>();
		System.out.println("�л� �̸�, ����, �й�, ������� �Է��ϼ���.");
		String [] sp;
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String s = scanner.nextLine();
			sp = s.split(", ");
			al.add(new Student(sp[0], sp[1], Integer.parseInt(sp[2]), Double.parseDouble(sp[3])));
		}
		for(int i=0; i<4; i++) {
			Student s = al.get(i);
			System.out.println("--------------------------------");
			System.out.println("�̸�:" + s.getName());
			System.out.println("�а�:" + s.getDept());
			System.out.println("�й�:" + s.getId());
			System.out.println("�������:" + s.getScore());
		}
		System.out.println("--------------------------------");
		while(true) {
			System.out.print("�л� �̸� >> ");
			String name = scanner.next();
			if(name.equals("�׸�"))
				break;
			for(int i=0; i<4; i++) {
				Student s = al.get(i);
				if(name.equals(s.getName())) {
					System.out.println(s.getName() + ", " + s.getDept() + ", " + s.getId() + ", " + s.getScore());
				}
			}
		}
		
		scanner.close();
	}

}
*/