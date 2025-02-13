package school;

public class Teacher extends Person  {private static final String NULL = null;
//inheritance 
	  private int teacherId;
	  private String name;
	  private int age;
      
	    

	   
	    public Teacher() {
		this.teacherId=0;
		name=NULL;
		age=0;
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



		public void  setTeacherId() {
			this.teacherId=teacherId;
		}
		public int getTeacherId() {
		return teacherId;
	}
		   @Override
		public void displayRole() {
	        System.out.println("i'm a teacher");
	    }
}

  