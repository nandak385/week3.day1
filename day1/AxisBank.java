package week3.day1;

public class AxisBank extends BankInfo{
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Override");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank Bank = new AxisBank();
		Bank.deposit();
		Bank.fixed();
		Bank.saving();

	}

}
