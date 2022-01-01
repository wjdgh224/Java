package practice7;
import java.util.*;

class Location {
	private String name;
	private int lati, longi;
	Location(int lati, int longi) {
		this.lati = lati; this.longi = longi;
	}
	public int getLati() {
		return lati;
	}
	public int getLongi() {
		return longi;
	}
}

public class ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Location> hm = new HashMap<String, Location>();
		String [] sp;
		System.out.println("도시, 경도, 위도를 입력하세요");
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String s = scanner.nextLine();
			sp = s.split(", ");
			hm.put(sp[0], new Location(Integer.parseInt(sp[1]), Integer.parseInt(sp[2])));
		}
		Set<String> s = hm.keySet();
		Iterator<String> it = s.iterator();
		System.out.println("----------------------");
		while(it.hasNext()) {
			String key = it.next();
			Location val = hm.get(key);
			System.out.println(key + "  " + val.getLati() + "  " + val.getLongi());
		}
		System.out.println("----------------------");
		while(true) {
			System.out.print("도시 이름 >> ");
			String key = scanner.next();
			Location val = hm.get(key);
			if(key.equals("그만"))
				break;
			
			if(val!=null) {
				System.out.println(key + "  " + val.getLati() + "  " + val.getLongi());
			}
			else
				System.out.println(key + "는 없습니다.");
		}
	
		scanner.close();
	}

}
