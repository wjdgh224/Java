package practice5;

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	
	abstract String delete(String key);
	
	abstract int length();
}

class Dictionary extends PairMap {
	String arr[][];
	int index = -1;
	Dictionary(int size) {
		arr = new String[2][size];
	}
	String get(String key) {
		for(int i=0; i<length(); i++) {
			if(arr[0][i].equals(key))
				return arr[1][i];
		}
		return "null";
		
	}
	void put(String key, String value) {
		for(int i=0; i<length(); i++) {
			if(arr[0][i].equals(key)) {
				arr[1][i] = value;
				return;
			}
		}
		index++;
		arr[0][index] = key;
		arr[1][index] = value;
	}
	String delete(String key) {
		for(int i=0; i<length(); i++) {
			if(arr[0][i].equals(key)) {
				arr[1][i] = null;
				index--;
				return arr[1][i];
			}
		}
		return "";
	}
	int length() {
		return index+1;
	}
}

public class ex10 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));

	}

}
