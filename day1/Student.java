package week3.day1;

public class Student extends Department{
	
	
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("studentName is Nanda");

	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("studentDept is Bsc cs");


	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("studentId is 15g250");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student clgDet = new Student();
		clgDet.collegeName();
		clgDet.deptName();
		clgDet.studentName();

	}

}
