interface V1{
	int x=10;
}
interface V2{
	int x=20;
}
class DemoChild5 implements V1,V2{
	int x=30;
	void fun(){
	System.out.println(x);
	System.out.println(V1.x);
	System.out.println(V2.x);
	}
}
class Client{
	public static void main(String[]args){
		DemoChild5 obj=new DemoChild5();
		obj.fun();
	}
}
