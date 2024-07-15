//Default Access Specifier
//We can use with same folder,same folder with different files but cannot different folders.

class Demo1{
	int numCourses=10;
        private String favCourse="java";
	void disp(){
		System.out.println(numCourses);
		System.out.println(favCourse);
	}
}
class Student{
	public static void main(String[]args){
		Demo1 obj=new Demo1();
		obj.disp();
		System.out.println(obj.numCourses);
		
	}
}
