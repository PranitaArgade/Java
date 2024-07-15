class Demo7{
	 void fun(int x){
		System.out.println(x);
	   }
	public static void main(String[]args){
		System.out.println("In Main");
		Demo7 obj=new Demo7();
		obj.fun(10);
		System.out.println("End Main");
	}
}
