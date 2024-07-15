class Demo5{
	int X=50;
	Demo5(){
	     this(10);
	     System.out.println("In No argument constructor");
	}
	Demo5(int X){
		super();
		System.out.println("In parameterized Constructor");
     }
     public static void main(String[]args){
	     Demo5 obj=new Demo5();
     }
}
