package school;

public class Main {
	 public static void main(String[] args) {
	        //encapsulation
	        Student student = new Student();
	        student.setName("mohr");
	        student.setAge(20);
	        student.setStudentId(200031814);
	        System.out.println("Student ID is: "+student.getStudentId());

	        System.out.println("Student Name: " + student.getName());

	        //inheritance
	        Teacher teacher = new Teacher();
	        teacher.setName("alaa eldein");
	        System.out.println("Teacher Name: " + teacher.getName());

	        //polymorphism
	        Person person1 = new Student();
	        Person person2 = new Teacher();
	        person1.setName("mahmoud");
	        person1.setName("20");
	        System.out.println(person1.getName());
	        System.out.println(person1.getAge());
	        person1.displayRole();
	        person2.displayRole(); 

	        //abstraction
	        Course mathCourse = new ProgrammingCourse ("Object Oriented Programming ");
	        mathCourse.displayCourseDetails(); 
	 }
}
