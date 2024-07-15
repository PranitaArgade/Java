class Conductor{
	void Ticket(){
		System.out.println("Depends on passenger Destination");
	}
}
class Passenger{
	public static void main(String[]args){
		Conductor obj=new Conductor(){
			void Ticket(){
				System.out.println("Pune to Sangamner");
			}
		};
		obj.Ticket();
	}
}
