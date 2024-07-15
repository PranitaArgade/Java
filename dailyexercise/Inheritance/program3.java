/*Output:
In Parent Constructor
In Parent Constructor
In Child Constructor
In Parent Constructor
In Child Constructor */

class Parent{
	Parent(){
		System.out.println("In Parent Constructor");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In Child Constructor");
	}
}
class Client{
	public static void main(String[]args){
		Parent obj=new Parent();
		Parent obj1=new Child();
		Child obj2=new Child();
		
	}
}
