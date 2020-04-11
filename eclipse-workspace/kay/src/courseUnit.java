
public class courseUnit {
	static String department ="IT";
	int CourseWork;
	String CourseName;
	
	public courseUnit (String name, int CourseWork)
	{
		CourseName=name;
		this.CourseWork=CourseWork;
		
	}
	public static void UpdateDepartment(String NewDept) {
	department=NewDept;
	
		
	}
	public void showMarks() {
		System.out.println("my marks "+CourseWork);
	}
		


public static void main (String[]args) {
	courseUnit objectOne=new courseUnit("oop",43);
	courseUnit objectTwo=new courseUnit("ccna",64);
	
	objectOne.showMarks();
	objectTwo.showMarks();
	courseUnit.UpdateDepartment("COMPUTER SCIENCE");
	System.out.println("objectOne department "+objectOne.department);
	
	System.out.println("objectTwo department "+objectTwo.department);
	
}
}