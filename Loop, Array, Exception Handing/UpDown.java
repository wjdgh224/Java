package practice3;
import java.util.Scanner;
import java.util.Random;

public class UpDown {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			Random r = new Random();
			int k = r.nextInt(100);
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			System.out.println("0-99");
			
			int i = 1, min = 0, max = 99;
			while(true) {
				System.out.print(i + ">>");
				int num = scanner.nextInt();
				if(k<num) {
					max = num-1;
					System.out.println("더 낮게");
					System.out.println(min + "-" + max);
				}
				else if(k>num){
					min = num+1;
					System.out.println("더 높게");
					System.out.println(min + "-" + max);
				}
				else {
					System.out.println("맞았습니다.");
					break;
				}
				i++;
			}
			
			System.out.print("다시하시겠습니까(y/n)>>");
			String s = scanner.next();
			if(s.equals("n"))
				break;
		}
		
		scanner.close();
	}

}
