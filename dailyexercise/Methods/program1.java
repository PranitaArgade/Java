
class MethodDemo{
	 static int x=10;
	static void fun(){
		System.out.println("in fun method");
	}
	 static void gun(){
		System.out.println("in gun method");
	}
       public static void main(String[]args){
	       fun();
	       gun();
	       System.out.println(x);
       }
}
