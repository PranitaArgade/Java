class Outer{
	void m1(){
		System.out.println("M1 in Outer class");
		class Inner{
			void m1(){
				System.out.println("M1 in inner");
			}
		}
		Inner obj=new Inner();
		obj.m1();
	}
	void m2(){
		System.out.println("m2 in outer");
	}
	public static void main(String[]args){
		Outer obj=new Outer();
		obj.m1();
		obj.m2();
	}
}
