class MethodDemo3{
	int x=20;
	static int y=30;
	void fun(){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[]args){
		MethodDemo3 obj= new MethodDemo3();
		obj.fun();
		//System.out.println(x);
		//System.out.println(y);
	}
}
