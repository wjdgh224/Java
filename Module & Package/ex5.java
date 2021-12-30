package practice6;
import java.util.Calendar;

public class ex5 {
	public static void print(Calendar c) {
		int hourOfDay = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		System.out.println("���� �ð��� " + hourOfDay + "�� " + minute + "���Դϴ�.");
		if(hourOfDay>=4 && hourOfDay<12)
			System.out.println("Good Morning");
		else if(hourOfDay>=12 && hourOfDay<18)
			System.out.println("Good Afternoon");
		else if(hourOfDay>=18 && hourOfDay<=22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		print(c);

	}

}
