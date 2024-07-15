/*
output:
10
20
10
20
-We can access static values directly by using class name.me.........*/

class StaticDemo1{
	static int x=10;
	static int y=20;
	static void disp(){
		System.out.println(x);
		System.out.println(y);
	}
}
class Client{
	public static void main(String[]args){
		System.out.println(StaticDemo1.x);
		System.out.println(StaticDemo1.y);
		StaticDemo1.disp();
	}
}
