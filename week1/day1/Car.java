package week1.day1;

	//syso--> ctrl+spacebar, enter
	//methods- Ctrl+spacebar,  enter
	//shotrcut--> main,ctrl+spacebar,enter

	//shortcut for execution cntrl+F11

	//access Specifier keyword ClassName
	public class Car {
		
		//Global variable
		
		String carModel="polo";

	// access specifier returnType methodName(){}	

		public void driveCar() {
			// local variable
			String driverName = "Kavi";
			//To print 
			
			System.out.println("I am driving my polo car");
			System.out.println(carModel);
			System.out.println(driverName);
					
		}
		
		public void parkCar() {
			System.out.println("Parked my car in my slot");
			System.out.println(carModel);

		}
		//main method
		public static void main(String[] args) {
			
			//syntax to create an object
			//ClassName objectName= new(keyword) ClassName()
			Car myCar=new Car();
			
			//Use  the object to call the method
			myCar.driveCar();
			myCar.parkCar();
			
			//calling global variable
			
			System.out.println(myCar.carModel);
		
			
		}
		
}
