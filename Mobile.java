package week1.day1;

public class Mobile {

	String mobileModel = "iPhone";
	int mobileWeight = 58;
	boolean isFullCharge = true;
	double mobileCost = 64000.23;

	public void makeCall() {
		System.out.println("Call to my Friend ");

	}

	public void sendMsg() {
		System.out.println("Message sent");

	}

	public static void main(String[] args) {
		Mobile myPhone = new Mobile();

		myPhone.makeCall();
		myPhone.sendMsg();
		System.out.println(myPhone.mobileModel);
		System.out.println(myPhone.mobileWeight);
		System.out.println(myPhone.isFullCharge);
		System.out.println(myPhone.mobileCost);

	}
}
