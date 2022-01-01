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
		System.out.println("학생 이름, 힉과, 학번, 학점평균 입력하세요.");
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
			System.out.println("이름:" + s.getName());
			System.out.println("학과:" + s.getDept());
			System.out.println("학번:" + s.getId());
			System.out.println("학점평균:" + s.getScore());
		}
		System.out.println("--------------------------------");
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.next();
			if(name.equals("그만"))
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