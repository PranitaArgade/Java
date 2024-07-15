class Employee{
	int empId=10;
        String name="Pranita";
	static int y=50;
	void EmpInfo(){
		System.out.println("Id="+empId);
		System.out.println("Name="+name);
		System.out.println("Y="+y);
	}
}
class MainDemo{
	public static void main(String[]args){
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.EmpInfo();
		emp2.EmpInfo();
		System.out.println("......................");
		emp2.empId=20;
		emp2.name="Kartik";
		emp2.y=200;
		emp1.EmpInfo();

		emp2.EmpInfo();
	}
}
