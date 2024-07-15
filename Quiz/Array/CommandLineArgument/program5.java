//java Demo5 &
//output:ArrayIndexOutOfBound.
/*
 - Special character like & have a mening in the shell(terminal).
 - When & is given at the command line ,the meaning of & in shell is
 -to run the command or task in the background and terminal does not wait for the task to finish.
 -so & becomes meaningful for shell  and never reaches String[]args(array).
 -And we try to access a value of the index where nothing is stored.
 thus we get,ArrayIndexOutOfBoundsException.*/
class Demo5{
	public static void main(String arg[]){
		System.out.println(arg[0]);
	}
}
