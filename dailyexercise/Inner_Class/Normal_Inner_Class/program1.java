class OuterDemo1{
	class InnerDemo1{
		void Fun(){
			System.out.println("Normal inner class Demo");
		}
	}
	void Gun(){
		System.out.println("Outer class Demo");
	}
}
class Client{
	public static void main(String[]args){
		OuterDemo1 obj=new OuterDemo1();
		obj.Gun();
		OuterDemo1.InnerDemo1 obj1 =new OuterDemo1().new InnerDemo1();
                obj1.Fun();
	}
}

