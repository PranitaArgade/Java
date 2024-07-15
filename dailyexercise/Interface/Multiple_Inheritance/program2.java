interface Demo1{
	static void M1(){
		System.out.println("Demo1-m1");
	}
}
interface Demo2{
	static void M2(){
		System.out.println("Demo2-m2");
	}
}
interface Demo3 extends Demo1,Demo2{
}
class Client{
	public static void main(String[]args){
		Demo1 obj=new DemoChild();
		Demo1.M1();
		Demo2.M2();
	}
}
