package practice7;
import java.util.*;

class Nation {
	private String country, capital;
	Nation(String country, String capital) {
		this.country = country; this.capital = capital;
	}
	String getCtry() {
		return country;
	}
	String getCap() {
		return capital;
	}
}

public class ex11_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Nation> v = new Vector<Nation>();
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int sel = scanner.nextInt();
			if(sel==1) {
				System.out.println("����" + v.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				while(true) {
					System.out.print("����� ���� �Է�" + (v.size()+1) + ">> ");
					String country = scanner.next();
					if(country.equals("�׸�"))
						break;
					String capital = scanner.next();
					int chk=0;
					for(int i=0; i<v.size(); i++) {//����Ʈ �ߺ� üũ
						String s = v.get(i).getCtry();
						if(country.equals(s)) {
							System.out.println(s + "�� �̹� �ֽ��ϴ�!");
							chk=1;
						}		
					}
					if(chk==0)
						v.add(new Nation(country, capital));
					
				}
			}
			else if(sel==2) {
				while(true) {
					int index = (int)(Math.random()*v.size());
					Nation n = v.get(index);
					System.out.print(n.getCtry() + "�� ������? ");
					String answer = scanner.next();
					if(answer.equals("�׸�"))
						break;
					if(answer.equals(n.getCap()))
						System.out.println("����!!");
					else
						System.out.println("�ƴմϴ�!!");
				}
			}
			else {
					System.out.println("������ �����մϴ�.");
					break;
				}
		}
		
		scanner.close();
	}

}
