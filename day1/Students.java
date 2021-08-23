package week3.day1;

public class Students {
	
	public void getStudentInfo() {
		// TODO Auto-generated method stub
		int ID = 02;
		System.out.println("Std Id is" + ID);
	}
	
	public void getStudentInfo(int id, String name) {
		// TODO Auto-generated method stub
		int ID = 02;
		System.out.println("Std Id is" + id);
		System.out.println("Std name is" + name);

	}
	
	public void getStudentInfo(String email , long number) {
		// TODO Auto-generated method stub
		int ID = 02;
		System.out.println("Std email address is" + email);
		System.out.println("Std Phonenumber is" + number);

	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students std = new Students();
		std.getStudentInfo();
		std.getStudentInfo(02, "Nanda");
		std.getStudentInfo("nandak385@gmail.com", 9566077380l);

	}

}
