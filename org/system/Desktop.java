package org.system;

public class Desktop extends Computer {

	public void desktopSize() {

		System.out.println("My Desktop size is 64 bit");

	}

	public static void main(String[] args) {
		Desktop ds = new Desktop();

		ds.computerModel();
		ds.desktopSize();

	}

}
