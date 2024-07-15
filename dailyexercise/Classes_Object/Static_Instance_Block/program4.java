class Company4{
	static{
		System.out.println("It Industry");
	}
	public static void main(String[]args){
		System.out.println("Top Company in pune");
	}
}
class Employee{
	static{
		System.out.println("Access Company facilities");
	}
	public static void main(String[]args){
		Company4 obj=new Company4();
	}
	static{
		System.out.println("CHO in Company");
	}
	
}

