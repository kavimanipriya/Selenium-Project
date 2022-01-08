package week3.day1;

public class SmartPhone extends Mobile {

public  void accessWhatApp() {
		System.out.println("WhatsApp enabled");

	}
	public void takevideo() {
		System.out.println("Video Sent by SmartPhone");

	}
	
	
public static void main(String[] args) 
{
	SmartPhone ph =new SmartPhone();
		
	ph.takevideo();
}
}
