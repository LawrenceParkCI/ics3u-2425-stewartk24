package unit1;

public class NetPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double netPay;
		double tax = 0.78;
		int insurance = 2;
		int hours = 40;
		int wage = 5;
		
		netPay = (hours*wage-insurance)*tax;
		
		System.out.println("The net pay for an employee that works " + hours + " hours is $" + netPay);
		
		
		
	}

}
