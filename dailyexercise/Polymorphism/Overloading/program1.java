class Demo1{
	void fun(int x){
		System.out.println(x);
	}
        void  fun(float x){
		System.out.println(x);
	}
}
class Client{
	public static void main(String[]args){
		Demo1 obj=new Demo1();
		obj.fun(10);
		obj.fun(11.22f);
	}
}
