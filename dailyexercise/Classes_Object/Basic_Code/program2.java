class Demo2{
	int x=20;
	static int y=26;
	void fun(){
		int z=30;
		System.out.println(z);
	}
	public static void main(String[]args){
		Demo2 obj=new Demo2();
		System.out.println(obj.x);
		obj.fun();
		System.out.println(y);
	}

}
