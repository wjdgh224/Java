package practice5;

interface PhoneInterface {
	final int TIMEOUT= 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface {
	public void sendCall() {
		System.out.println("�츮������");
	}
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	
	public void flash() { System.out.println("��ȭ�⿡ ���� �������ϴ�."); }
}

public class InterfaceEx {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

}
