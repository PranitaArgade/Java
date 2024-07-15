/*
output:
Instance block 1
Instance Block 2
Consteuctor
Main Method*/

class InstanceBlockDemo6{
         String str="Pranita";
	 int x=10;
	 InstanceBlockDemo6(){
		 System.out.println("Constructor");
	 }
	 {
		 System.out.println("Instance block1");
	 }
	 public static void main(String[]args){
		 InstanceBlockDemo6 obj=new InstanceBlockDemo6();
		 System.out.println("Main Method");
	 }
	 {
		 System.out.println("Instance Block 2");
	 }
}
