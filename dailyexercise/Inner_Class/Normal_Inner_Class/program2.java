class Outer2{
	class Inner2{
		int x=20;
		void Fun(){
			System.out.println("Inner class");
			System.out.println(x);
		}
	}
       int x=10;
       int y=30;
   public static void main(String[]args){
	   System.out.println("Main method");
	   Outer2 obj1 =new Outer2();
	   System.out.println(obj1.x+obj1.y);
	   Inner2 obj=new Outer2().new Inner2();
	   obj.Fun();
   }
}
