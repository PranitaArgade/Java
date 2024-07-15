class Solution7{
	int x=10;
	static int y=20;
	Solution7(){
		System.out.println("Constructor");
	}
	static{
		System.out.println("Static block 1");
	}
	{
		System.out.println("Instance block 1");
	}
	public static void main(String[]args){
		System.out.println("IN Main");
		Solution7 obj= new Solution7();
		}
	static{
		System.out.println("Static block 2");
	}
	{
		System.out.println("Instance block 2");
	}
}

