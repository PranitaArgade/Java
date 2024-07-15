//Method Signature check keli jhate compile time la.
/*output
 Parent Constructor
In Child Constructor
In Parent fun
*/
class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
	void fun(int x){
		System.out.println("In Parent fun");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In Child Constructor");
	}
	void fun(){
		System.out.println("In Child Fun");
	}
}
class Client{
	public static void main(String[]args){
		Child obj=new Child();
		obj.fun(10);
	}
}
