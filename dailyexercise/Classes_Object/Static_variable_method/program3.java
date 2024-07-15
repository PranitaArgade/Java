class Booking3{
	int HallCapacity=100;
	static int No_of_Seats=80;
	void MovieTime(){
		System.out.println(HallCapacity);
		System.out.println(No_of_Seats);
	}
	static void Ticket_prize(){
		System.out.println(No_of_Seats);
	}
}
class Viewers{
	public static void main(String[]args){
		Booking3 obj=new Booking3();
		obj.MovieTime();
		obj.Ticket_prize();
		System.out.println(obj.HallCapacity);
		System.out.println(obj.No_of_Seats);
	}
	
}
