class Return10{
	int fun(int x){
		int y=x+10;
		return y;
	}
	public static void main(String[]args){
		Return10 obj=new Return10();
		int a=obj.fun(10);
		System.out.println(a);
	}
}
