package practice7;
import java.util.*;

class Student {
	private String dept;
	private int id;
	private double score;
	Student(String dept, int id, double score) {
		this.dept = dept;
		this.id = id; this.score = score;
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
public class ex5_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Student> hm = new HashMap<String, Student>();
		String [] sp;
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String s = scanner.nextLine();
			sp = s.split(", ");
			hm.put(sp[0], new Student(sp[1], Integer.parseInt(sp[2]), Double.parseDouble(sp[3])));
		}

		Set<String> s = hm.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Student val = hm.get(key);
			System.out.println("-----------------------");
			System.out.println("이름:" + key);
			System.out.println("학과:" + val.getDept());
			System.out.println("학번:" + val.getId());
			System.out.println("학점평균:" + val.getScore());	
		}
		System.out.println("-----------------------");
		while(true) {
			System.out.print("학생 이름 >> ");
			String key = scanner.next();
			Student val = hm.get(key);
			if(key.equals("그만"))
				break;
			if(val!=null) {
				System.out.println(key + ", " + val.getDept() + ", " + val.getId() + ", " + val.getScore());
			}
		}
		
		scanner.close();
	}

}
