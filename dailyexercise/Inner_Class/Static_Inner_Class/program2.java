class RelationShip{
	static class Mother{
		void Doughter(){
			System.out.println("Doughter");
		}
		void Wife(){
			System.out.println("Wife");
		}
	}
}
class Client{
	public static void main(String[]args){
		RelationShip.Mother obj=new RelationShip.Mother();
		obj.Doughter();
		obj.Wife();
	}
}

