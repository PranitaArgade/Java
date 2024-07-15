//setter() and getter() method.
/*
output:
In Constructor
18 = Virat
In Constructor
45 = Rohit
In Constructor
7 = MSD*/

class Player{
	private int JerNo=0;
	private String name=null;
	
	Player(int JerNo,String name){
	     	this.JerNo=JerNo;
		this.name=name;
		System.out.println("In Constructor");
	}
	void Info(){
		System.out.println(JerNo+" = "+name);
	}
}
class Client{
	public static void main(String[]args){
	Player obj1=new Player(18,"Virat");
	obj1.Info();
	Player obj2=new Player(45,"Rohit");
	obj2.Info();
	Player obj3=new Player(7,"MSD");
	obj3.Info();
	}
}
