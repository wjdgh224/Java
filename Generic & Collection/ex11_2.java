package practice7;
import java.util.*;

public class ex11_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<String, String>();
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int sel = scanner.nextInt();
			if(sel==1) {
				System.out.println("���� " + hm.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				while(true) {
					System.out.print("����� ���� �Է�" + (hm.size()+1) + ">> ");
					String country = scanner.next();
					if(country.equals("�׸�"))
						break;
					String capital = scanner.next();
					if(hm.get(country)==null)
						hm.put(country, capital);
					else
						System.out.println(country + "�� �̹� �ֽ��ϴ�!");
				}
			}
			else if(sel==2) {
				while(true) {
					Set<String> s = hm.keySet();
					Object array [] = s.toArray();
					int index = (int)(Math.random()*hm.size());
					String country = (String)array[index];
					String capital = hm.get(country);
					System.out.print(country + "�� ������? ");
					String answer = scanner.next();
					if(answer.equals("�׸�"))
						break;
					if(capital.equals(answer))
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
