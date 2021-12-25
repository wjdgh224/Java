package practice3;

public class ex7 {

	public static void main(String[] args) {
		int a[] = new int[10];
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*10 + 1);
			System.out.print(a[i] + " ");
		}
		
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		System.out.println();
		System.out.println("Æò±ÕÀº " + (double)sum/a.length);
	}

}
