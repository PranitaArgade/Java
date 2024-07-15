class Core2Web{
	int numCourses=8;
	String favCourse="java";
	void disp(){
		System.out.println(numCourses);
		System.out.println(favCourse);
	}
}
class Student{
	public static void main(String[]args){
		Core2Web obj=new Core2Web();
		obj.disp();
		System.out.println(obj.numCourses);
		System.out.println(obj.favCourse);
	}

}
