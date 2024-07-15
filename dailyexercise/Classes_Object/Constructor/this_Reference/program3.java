/*
output:
In Constructor
10
Demo3@7ad041f3
5
10
In Parameterized Constructor*/
class Demo3{
	int y=5;
	Demo3(){//Demo3(Demo3 this)
		System.out.println("In Constructor");
	}
	Demo3(int y){  //Demo3(Demo3 this,int x)
		System.out.println(y);//print the passing variable means it is near.
		System.out.println(this);
		System.out.println(this.y);//print the instance variable
		this.y=y;
		System.out.println(this.y);
		System.out.println("In Parameterized Constructor");
	}
}
class Client{
	public static void main(String[]args){
		Demo3 obj=new Demo3(); //Demo3(obj)
		Demo3 obj1=new Demo3(10); //Demo3(obj1)
	}
}
