class Demo2{
	int x=10;
	private int y=20;
	void fun(){
		System.out.println(x);
		System.out.println(y);
	}
}
class MainDemo{
	public static void main(String[]args){
		Demo2 obj=new Demo2();
		obj.fun();
		System.out.println(obj.x);
      //		System.out.println(obj.y);(error:y has private access)
	

	}
}
