/*Output
    In Parent Constructor
    Child Constructor
    Home,Car,Gold
    Alia Bhatt
*/
class Parent{
	Parent(){
		System.out.println("In Parent Constructor");
	}
	void Property(){
		System.out.println("Home,Car,Gold");
	}
	void Marry(){
		System.out.println("Deepika Padukone");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child Constructor");
	}
	void Marry(){
		System.out.println("Alia Bhatt");
	}

}
class Client{
	public static void main(String[]args){
		Child obj=new Child();
               obj.Property();
	       obj.Marry();
	}
}
