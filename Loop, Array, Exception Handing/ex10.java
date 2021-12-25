package practice3;

public class ex10 {

	public static void main(String[] args) {
		int a[][] = {{0, 0, 0, 0},
					 {0, 0, 0, 0},
					 {0, 0, 0, 0},
					 {0, 0, 0, 0}};
		
		int count=0;
		
		while(true) {
			int r = (int)(Math.random()*4);
			int c = (int)(Math.random()*4);
			if(a[r][c]==0) {
				a[r][c] = (int)(Math.random()*10+1);
				count++;
			}
			if(count==10)
				break;
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}

	}

}
