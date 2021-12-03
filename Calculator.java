package week1.day2;

public class Calculator {
	
	
	public int add(int num1,int num2) {
		return num1 +num2;
	}
	
	public double sub(double num1,double num2) {
		return num1 -num2;
	}
	
	public double mul(double num1,double num2) {
		return num1 * num2;
	}
	
	public int div (int num1,int num2) {
		return num1 /num2;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(20,30));
		System.out.println(calc.sub(30.5,10.2));
		System.out.println(calc.mul(10.1,5.2));
		System.out.println(calc.div(10,5));
		
		
				

	}

}
