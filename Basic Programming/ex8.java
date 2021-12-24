package practice;
import java.util.Scanner;

public class ex8 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if(((x>=rectx1)&&(x<=recty1))&&(y>=rectx2&&y<=recty2))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if(inRect(x1,y1,100,200,100,200)||inRect(x2,y2,100,200,100,200))
			System.out.println("Ãæµ¹");
		
		scanner.close();
	}

}
