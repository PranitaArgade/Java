interface Demo1{
	void Fun();
}
interface Demo2{
	void Fun();
}
class DemoChild implements Demo1,Demo2{
	public void Fun(){
		System.out.println("In Fun Child");
	}
}
class Client{
	public static void main(String[]args){
		Demo1 obj1=new DemoChild();
		obj1.Fun();
		Demo2 obj2=new DemoChild();
		obj2.Fun();
	}
}
