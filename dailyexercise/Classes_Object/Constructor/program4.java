class Demo4{
	int x=20;
	String str="Pranita";
	void fun(){
		String str2="pranita";
		String str3=new String("Argade");
		System.out.println(str2);
		System.out.println(str3);
	}
	public static void main(String[]args){
		Demo4 obj=new Demo4();
		obj.fun();
		System.out.println(obj.str);
	}
}
