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
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));

	}

}
