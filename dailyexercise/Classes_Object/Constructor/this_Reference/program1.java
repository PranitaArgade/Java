/*
output:
inConstructor
Demo1@1dbd16a6
10
Demo1@1dbd16a6
Demo1@1dbd16a6
10
*/
class Demo1{
	int x=10;
	Demo1(){    //Demo1(Demo1 this)
		System.out.println("InConstructor");
		System.out.println(this);
		System.out.println(this.x);
	}
	void Fun(){     //Fun(Demo1 this)
		System.out.println(this);
		System.out.println(x);
	}
	public static void main(String[]args){
		Demo1 obj=new Demo1();//Demo1(obj)
	        System.out.println(obj);
		obj.Fun();            //Fun(obj)
	}
}
