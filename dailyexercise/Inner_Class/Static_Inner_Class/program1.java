class Outer{

	static class Inner{
		 int Hostel_Student_Capacity=400;
		void floor(){
			System.out.println("4 floor");
			System.out.println("Student Capacity:"+Hostel_Student_Capacity);
		}
	}
}
class Client{
	public static void main(String[]args){
		Outer.Inner obj=new Outer.Inner();
		obj.floor();
	}
}
