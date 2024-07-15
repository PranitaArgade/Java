class Outer{
	int x=20;
	static int y=50;
	class Inner{
		void Fun(){
			System.out.println("Fun inner");
			System.out.println(x);
			System.out.println(y);
			fun1();
		}
	}
	void fun1(){
		System.out.println("Fun1 outer");
	
	}
	public static void main(String[]args){
		Inner obj=new Outer().new Inner();
		obj.Fun();
	}

}
