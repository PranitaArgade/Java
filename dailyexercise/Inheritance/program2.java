/*output:
 In Parent Constructor
In child Constructor
Flat,Car,Gold
*/
class Parent{
	Parent(){
		System.out.println("In Parent Constructor");
	}
	void parent_property(){
		System.out.println("Flat,Car,Gold");
	}
}
class Child extends Parent{
	Child(){
	System.out.println("In child Constructor");
}
}
class Client{
	public static void main(String[]args){
		Child obj=new Child();
		obj.parent_property();
	}
}
