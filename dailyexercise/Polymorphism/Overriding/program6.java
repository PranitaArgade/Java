//Return type jar classes astil tar tyat Parent child relationship pahijhe.

class Parent{
	Object Gun(){
		Object obj=new Object();
		System.out.println("Parent Gun");
		return obj;

	}
}
class Child extends Parent{
	String Gun(){
		System.out.println("Child Gun");
		return "Priti";
	}
}
class Client{
	public static void main(String[]args){
		Parent p=new Child();
		System.out.println(p.Gun());

		Parent obj1=new Parent();
		System.out.println(obj1.Gun());

	}
}
