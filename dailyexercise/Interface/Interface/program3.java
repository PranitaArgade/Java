//Write a real time example

interface MarriedLife{
	void Successful();
	void Problems();
	void Expectation();
}
abstract class ParentExpectation implements MarriedLife{
	public void Expectation(){
		System.out.println("Handle all responsibilities in house");
	}
}
class Couple extends ParentExpectation{
	public void Successful(){
		System.out.println("Understanding between them ");
	}
	public void Problems(){
		System.out.println("Cannot Handle everything...its difficult to manage all things");
	}
}
class Family{
	public static void main(String[]args){
		MarriedLife obj=new Couple();
		obj.Successful();
		obj.Problems();
		obj.Expectation();
	}
}
