//Variables in interface

interface Demo4{
	int x=10;
	void fun();
}
class DemoChild4 implements Demo4{
	public void fun(){
		System.out.println(x);
		System.out.println(Demo4.x);
	}
}
class Client{
	public static void main(String[]args){
		Demo4 obj=new DemoChild4();
		obj.fun();
	}
}
