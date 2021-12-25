package practice3;

public class ex13 {

	public static void main(String[] args) {
		for(int i=1; i<100; i++) {
			int first = i/10;
			int second = i%10;
			if(((first==3)||(first==6)||(first==9))&&((second==3)||(second==6)||(second==9)))
				System.out.println(i + " ¹Ú¼ö Â¦Â¦");
			else if(((first==3)||(first==6)||(first==9))||((second==3)||(second==6)||(second==9)))
				System.out.println(i + " ¹Ú¼ö Â¦");
		}

	}

}
