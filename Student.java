package school;

public class Student extends Person { private static final String NULL = null;
// encapsulation 
	
	
		private String name;
		private int age;
	    private int studentId;
	    

		public Student() {
			
			name = NULL;
			age = 0;
		 studentId =0;
		}

		public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public int getStudentId() {
	        return studentId;
	    }

	    public void setStudentId(int studentId) {
	        this.studentId = studentId;
	    }
	    @Override
	    public void displayRole() {
	        System.out.println("i'm a student");
	    }
	}


