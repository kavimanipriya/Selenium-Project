package week3.day2;

public class Desktop implements Software {

	public void hardwareResource() {
		System.out.println("HardwareResource");

	}

	public void softwareResources() {
		System.out.println("SoftwareResource");

	}

	public void desktopModel() {
		System.out.println("DesktopModel");

	}

	public static void main(String[] args) {
		Desktop dt = new Desktop();
		dt.hardwareResource();
		dt.softwareResources();
		dt.desktopModel();

	}

}
