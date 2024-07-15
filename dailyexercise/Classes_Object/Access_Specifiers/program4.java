/*output:
  10
  20
  30
  100
  20
  300
  10
  20
  300
  */
class Demo4{
	int x=10;
	private int y=20;
	static int z=30;
	void disp(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
class Client{
	public static void main(String[]args){
		Demo4 obj1=new Demo4();
		Demo4 obj2=new Demo4();
		obj1.disp();
		obj1.x=100;
		obj2.z=300;
		obj1.disp();
		obj2.disp();
	}
}
