package practice3;

public class ex1 {

	public static void main(String[] args) {
		/*int sum=0, i=0;
		while(i<100) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);*/
		
		/*int sum=0;
		for(int i=0; i<100; i+=2) {
			sum += i;
		}
		System.out.println(sum);*/
		
		int i=0, sum=0;
		do {
			sum +=i;
			i+=2;
		}while(i<100);
		System.out.println(sum);

	}

}
