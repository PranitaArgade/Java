/*
output:
java StaticDemo3
 -static block 1
 -In main*/
class StaticDemo3{
	static{
		System.out.println("Static block 1");
	}
	public static void main(String[]args){
		System.out.println("In Main");
	}
}
class Client{
	static{
		System.out.println("Static block2");
	}
	public static void main(String[]args){
		System.out.println("In client main");
	}
}
