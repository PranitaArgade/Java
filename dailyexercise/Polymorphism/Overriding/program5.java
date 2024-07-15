//Primitive Return type Should be Same.
class Parent{
       char fun(){
       System.out.println("Parent Fun");
       return 'A';
       }
}
class Child extends Parent{
	char fun(){
		System.out.println("Child fun");
		return 'B';
	}
}
class Client{
	public static void main(String[]args){
		Parent obj=new Child();
		obj.fun();

	}
}
