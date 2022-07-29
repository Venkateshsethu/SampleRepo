
public class Calculator {

	public Calculator()
	{
		System.out.println("this is constructor");
	}
	
	public void add() {
		System.out.println("Adding numbers");
	}
	
	public void sub() {
		System.out.println("Subtract numbers");
	}

	public static void main(String[] args) {
		System.out.println("Hellow world");
		
		Calculator calc =new Calculator();
				
				String check;
		
		calc.add();
		calc.sub();
		
	}

}
