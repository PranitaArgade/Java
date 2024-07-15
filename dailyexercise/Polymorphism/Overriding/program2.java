//Write a real time example of overriding.
class ParentDream{
	ParentDream(){
		System.out.println("In ParentDream Constructor");
	}
	void ChildFuture(){
		System.out.println("Doctor");
	}
	void Admission(){
		System.out.println("Government clg of MBBS");

	}
}
class Child extends ParentDream{
	Child(){
		System.out.println("Child Dream");
	}
	void ChildFuture(){
		System.out.println("IT Engineer");
	}
	void Admission(){
		System.out.println("IIT College");
	}
}
class Client{
	public static void main(String[]args){
		Child obj=new Child();
		obj.ChildFuture();
		obj.Admission();
	}
}
