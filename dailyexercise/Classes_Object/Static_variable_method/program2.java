/*output:
  50
  100
  100
  50
  100*/
class StaticDemo2{
	int x=50;
	static int y=100;
	void fun1(){
		System.out.println(x);
		System.out.println(y);
	}
	static void fun2(){
		System.out.println(y);
	}
}
class Client{
	public static void main(String[]args){
		StaticDemo2 obj1=new StaticDemo2();
		obj1.fun1();
		obj1.fun2();
		System.out.println(obj1.x);
		System.out.println(obj1.y);//System.out.println(StaticDemo2.y)
	}
}

