//Access Specifier in overriding.

class Parent{
     void fun(){
		System.out.println("Fun In Parent");
	}
}
class Child extends Parent{
    public void fun(){
   		System.out.println("Fun In Child");
	}
}
class Client{
	public static void main(String[]args){
		Parent obj=new Child();
		obj.fun();
	}
}
