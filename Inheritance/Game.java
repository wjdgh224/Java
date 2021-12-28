package practice5;
import java.util.Scanner;

abstract class GameObject {
	protected int distance;
	protected int x, y;
	public GameObject(int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}
	public int getX() { return x; }
	public int getY() { return y; }
	public boolean collide(GameObject p) {
		if(this.x == p.getX() && this.y == p.getY())
			return true;
		else
			return false;
	}
	protected abstract void move();
	protected abstract char getShape();
}

class Bear extends GameObject {
	Scanner scanner = new Scanner(System.in);
	Bear() {
		super(0, 0, 1);
	}
	protected void move() {
		System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
		char c = scanner.next().charAt(0);
		if(c=='a') {//배열이여서 x, y 반대로 넣었음
			y = getY() - 1;
		}
		else if(c=='s') {
			x = getX() + 1;
		}
		else if(c=='d') {
			x = getX() - 1;
		}
		else {
			y = getY() + 1;
		}
	}
	protected char getShape() {
		return 'B';
	}
}

class Fish extends GameObject {
	Fish() {
		super(5, 5, 1);
	}
	protected void move() {//랜덤하게 움직임
		int ran = (int)(Math.random()*4);
		if(ran==0) {
			y = getY() - 1;
		}
		else if(ran==1) {
			x = getX() + 1;
		}
		else if(ran==2) {
			x = getX() - 1;
		}
		else {
			y = getY() + 1;
		}
	}
	protected char getShape() {
		return '@';
	}
}

public class Game {
	public static void main(String[] args) {
		char a [][] = {{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
					   {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
					   {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
					   {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
					   {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
					   {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
					   {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
					   {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
					   {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
					   {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}};
		Bear b = new Bear();
		Fish f = new Fish();
		a[b.getX()][b.getY()] = b.getShape();
		a[f.getX()][f.getX()] = f.getShape(); 
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");
		int cnt = 0;
		int ran[] = new int[5];
		while(!b.collide(f)) {
			if(cnt==0) {
				for(int i=0; i<5; i++)
					ran[i] = 0;
				int chk = 0;//5번 중 2번만 움직이게..
				while(chk!=2) {
					int r = (int)(Math.random()*5);
					if(ran[r]==0) {
						ran[r] = 1;
						chk++;
					}
				}
			}
			
			for(int i=0; i<10; i++) {
				for(int j=0; j<20; j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
			a[b.getX()][b.getY()] = '-';
			b.move(); 
			if(ran[cnt]==1) {
				a[f.getX()][f.getY()] = '-';
				f.move();
				a[f.getX()][f.getY()] = f.getShape();
			}
			a[b.getX()][b.getY()] = b.getShape();
			cnt = (cnt+1)%5;
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<20; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("Bear Wins!!");

	}

}
