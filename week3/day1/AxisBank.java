package week3.day1;

public class AxisBank extends BankInfo {
	

	public void deposit() {
		
		System.out.println("Deposit from Axis Bank");
		
	}

	public static void main(String[] args) {
		
			
		AxisBank axb =new AxisBank();
		axb.deposit();
		
		BankInfo bi = new BankInfo();
		bi.savings();
		bi.fixed();
	}

}
