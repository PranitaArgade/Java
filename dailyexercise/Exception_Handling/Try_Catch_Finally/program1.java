//Try and Catch code

class Demo{
	public static void main(String[]args){
		System.out.println("Start Main");
		try{
			System.out.println(10/0);//Risky Code
		}
		catch(ArithmeticException obj){ //Handling code
			System.out.println("Exception Occurred");
		}
		System.out.println("End Main");
	}
}
