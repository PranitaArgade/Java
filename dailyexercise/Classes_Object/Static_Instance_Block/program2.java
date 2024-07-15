//output:Hello World
class StaticDemo2{
	static{
		System.out.println("Hello World");
		System.exit(0);//Exit the program not going to main.
	}
	public static void main(String[]args){
		System.out.println("Main Method");
	}
}
