class Outer{
	int x=10;
	static int z=20;
	class Inner{
		  static int y=30;
	
	}
}
class Client{
	public static void main(String[]args){
		Outer obj1=new Outer();
		System.out.println(Outer.z);
		System.out.println(obj1.x);
	     Outer.Inner obj=obj1.new Inner();
	     System.out.println(obj1.new Inner().y);

		
		
	}



}

