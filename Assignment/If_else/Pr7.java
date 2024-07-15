class Pr7{
	public static void main(String[]args){
		int SP=900;
		int CP=900;
		if(SP>CP){
			System.out.println("Profit of "+(SP-CP));
		}else if(CP>SP){
			System.out.println("Loss of "+(CP-SP));
		}else{
			System.out.println("Neither loss nor Profit");
		}
	}
}
