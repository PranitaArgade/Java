class IntegerCacheDemo1{
	public static void main(String[]args){
		int x=20;
		int y=20;
		Integer z=20;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
	}
}
