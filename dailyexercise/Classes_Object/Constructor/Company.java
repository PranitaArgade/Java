class Company{
	int no_branches=10;
	void WorkingTime(){
		System.out.println("8 hrs per day");
	}
	public static void main(String[]args){
		Company obj=new Company();
		obj.WorkingTime();
		System.out.println(obj.no_branches);
	}
}
