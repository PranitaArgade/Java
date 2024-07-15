//electricity bill problem
//Given an integer input A which respects units of electricity consumed at your house
//calculate and print the bill amount.
//units<=100:price per unit is 1
//units>100 :price per unit is 2
//input:50
//output:50
//input:200
//output:300
class Elect{
	public static void main(String[]args){
		int units=200;
		if(units<=100){
			System.out.println(units*1);
		}
		else{
			System.out.println(100*1+(units-100)*2);
		}
	}
}

