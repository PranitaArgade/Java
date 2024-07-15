//overloading means same name but different parameter.
/*output:
  10
20.77
In Demo Parameter
Demo2@7ad041f3
*/
class Demo2{
	void fun(int x){
		System.out.println(x);
	}
        void fun(float y){
		System.out.println(y);
	}
	void fun(Demo2 obj){
		System.out.println("In Demo Parameter");
		System.out.println(obj);
	}
}
class Main{
	public static void main(String[]args){
		Demo2 obj=new Demo2();
		obj.fun(10);
		obj.fun(20.77f);
		obj.fun(obj);
	}
}
