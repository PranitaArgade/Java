class Demo8{
	public static void main(String[]args){
		System.out.println("In main");
		Demo8 obj= new Demo8();
		obj.fun(20);
		obj.fun(20.32f);
		obj.fun('A');
		
	}
	void fun(float x ){
		System.out.println("In Function");
		System.out.println(x);
		
	}
}
