class Project{
	String proName="OnlineEdu";
	int noOfEmp=20;
	void ClientInfo(){
		String ClientName="Core2Web";
		System.out.println(ClientName);
		System.out.println(proName);
		System.out.println(noOfEmp);
	}
}
class C2W{
	public static void main(String[]args){
		Project obj=new Project();
		obj.ClientInfo();
	}
}

