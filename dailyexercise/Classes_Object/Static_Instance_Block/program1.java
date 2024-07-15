/*
  output:
  Sstic block1
  Static block 2
  20
  10
  20*/
class StaticDemo1{
	int x=10;
	static int y=20;
	static{
		System.out.println("Static block1");
	}
	public static void main(String[]args){
		StaticDemo1 obj=new StaticDemo1();
		System.out.println(obj.x);
		System.out.println(y);
	}
	static{
		System.out.println("Static Block2");
		System.out.println(y);
	}

	
}
