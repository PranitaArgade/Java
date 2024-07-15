class MethodDemo2{
	int x=10;
	int y=20;
	static void fun(){
		System.out.println("IN FUM METHOD");
	}
	void gun(){
		System.out.println("IN GUN METHOD");
	}
	public static void main(String[]args){
		MethodDemo2 obj =new MethodDemo2();
		System.out.println(obj.x);
		System.out.println(obj.y);
		//fun();
		obj.fun();
		obj.gun();
	}
}
