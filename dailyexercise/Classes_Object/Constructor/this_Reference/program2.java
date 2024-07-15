class Demo2{
	Demo2(){
		System.out.println("In No-args Constructor");
	}
	Demo2(int x){
		System.out.println("In parameterized Constructor");
	}
	Demo2(Demo2 XYZ){
		System.out.println("Parameterized Demo2");
	}
	public static void main(String[]args){
		Demo2 obj1=new Demo2();
		Demo2 obj2=new Demo2(10);
		Demo2 obj3=new Demo2(obj2);
	}
}

