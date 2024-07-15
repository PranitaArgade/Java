interface Demo{
	void Fun();
	void Gun();
}
abstract class DemoChild implements Demo{
	public void Gun(){
		System.out.println("In Gun");
	}
}
class DemoChild1 extends DemoChild{
	public void Fun(){
		System.out.println("In Fun");
	}
}
class Client{
	public static void main(String[]args){
		Demo obj=new DemoChild1();
		obj.Fun();
		obj.Gun();
	}
}
