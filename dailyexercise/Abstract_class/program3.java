abstract class Electricity{
	void Unit(){
		System.out.println("Depend on use");
	}
	abstract void bill();
}
class ElectricityArea extends Electricity{
	void bill(){
		System.out.println("5 rs per unit");
	}
}
class Client {
	public static void main(String[]args){
		Electricity obj=new ElectricityArea();
		obj.Unit();
		obj.bill();
	}
}
