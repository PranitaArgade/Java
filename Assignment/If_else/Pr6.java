class Pr6{
	public static void main(String[]args){
		int num1=42;
		int num2=32;
		int num3=42;
		if(num1>num2 && num1>num3){
			System.out.println(num1+ " is the maximum between " +num1+" ,"+num2+"and"+num3);
		}else if(num2>num1 && num2>num3){
			System.out.println(num2 +" is the maximum between " +num1+" ,"+num2+ "and"+num3);
		}else{
			System.out.println(num3 +" is the maximum between "+num1+" ,"+num2+"and"+ num3);
		}
	}
}
