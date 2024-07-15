/*output:
In No argument Constructor
In Parameterized Constreuctor*/
class Demo4{
	int X=20;
	Demo4(){
		System.out.println("In No argument Constructor");
	}
	Demo4(int X){
	        this();  //this line must be first statement(used to call another constructor in same class)
		System.out.println("In Parameterized Constreuctor");
	}
	public static void main(String[]args){
		Demo4 obj=new Demo4(10);
	}
}

