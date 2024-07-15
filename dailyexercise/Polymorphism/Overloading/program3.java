//Write a real time example of overloading
class Hostel{
	void Friends(String name,int RoomNo1){
		System.out.println(name);
		System.out.println(RoomNo1);
	}
	void Friends(String name,float RoomNo2){
		System.out.println(name);
		System.out.println(RoomNo2);
	}
}
class Client{
	public static void main(String[]args){
		Hostel obj=new Hostel();
		obj.Friends("Pranita",111);
		obj.Friends("Manasi",102.00f);
	}
}

