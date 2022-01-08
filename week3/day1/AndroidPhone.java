package week3.day1;

public class AndroidPhone extends SmartPhone{

	public void takeVideo() {
		System.out.println("Taken Video by using Android Phone ");

	}
	public static void main(String[] args) {
		AndroidPhone myphone =new AndroidPhone();
		
		myphone.saveContact();
		myphone.sendMsg();
		myphone.makeCall();
		myphone.accessWhatApp();
		myphone.takeVideo();
		
		//override
		SmartPhone ph =new SmartPhone();
		
		ph.takevideo();

	}

}
