package week3.day1;

public class Cal {
	
	public void add (int a, int b){
		System.out.println("add= " + a+b);
			
	}
	
	public void add (int a, int b, int c){
		System.out.println("add1= " + a+b+c);
			
	}
	
	public void multiply(int a, int b){
		
		System.out.println("multiply= " + a*b);
		
	}
	
    public void multiply(double a, int b, int c){
		
		System.out.println("multiply1 = " + a*b*c);
		
	}
	public void subtract(int a, int b){
	
		System.out.println("subtract= " + (a-b));
		
	}
	
	public void subtract(double b, int a, int c){
		
		System.out.println("subtract1= " + (a-b-c));
		
	}
	
	public void divide (int a, int b){
		
		System.out.println("divide= " + a/b);
		
	}

    public void divide (double a, int b, int c){
		
		System.out.println("divide1= " + a/b/c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cal ca =new Cal();
		ca.add(5, 5);
		ca.add(4, 5, 4);
		ca.multiply(5, 5);
		ca.multiply(4, 4, 4);
		ca.divide(8, 4);
		ca.divide(5, 5, 5);
		ca.subtract(4, 3);
		ca.subtract(2, 4, 1);

	}

}
