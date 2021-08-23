package week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Mobile de = new Mobile();
		de.makeCall();
		de.saveContact();
		de.SendMsg();
		
		System.out.println("***********object for AndroidPhone");
		AndroidPhone details = new AndroidPhone();
		details.makeCall();
		details.saveContact();
		details.SendMsg();
		details.takeVideo();
		
		System.out.println("***********object for SmartPhone class");
		
		SmartPhone details1 = new SmartPhone();
		details1.takeVideo();
		details1.connectWhatsApp();
		details1.makeCall();
		details1.saveContact();
		details1.SendMsg();
		
		
		

	}

	

}
