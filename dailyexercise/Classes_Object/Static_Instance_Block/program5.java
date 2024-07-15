class StaticDemo5{
	static int x=10;
	static{
		 int g=10;
		 System.out.println(g);
	}
	void fun(){
		 int y=20;
		 System.out.println(y);
	}
	static void gun(){
		 int z=30;
		 System.out.println(z);
	}
	public static void main(String[]args){
		StaticDemo5 obj=new StaticDemo5();
		obj.fun();
		obj.gun();
	}
}
