abstract class Parent{
	abstract void Surname();
}
class Child extends Parent{
	void Surname(){
		System.out.println("Parent Surname");
	}
}
class Client{
	public static void main(String[]args){
		Child obj=new Child();
		obj.Surname();
	}
}

