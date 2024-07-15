abstract class Parent{
	void Career(){
		System.out.println("Actors");
	}
	abstract void marry();
}
 class Child extends Parent{
	void marry(){
		System.out.println("Disha Patni");
	}
}
 class Client{
	public static void main(String[]args){
		Parent obj=new Child();
          	obj.marry();
		obj.Career();

	}
}
