package school;

 public class Person { 
	    private static final String NULL = null;
		private String name;
	    private int age;

	    public Person() {
	    	this.name=NULL;
	    	this.age=0;
	    	
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getAge() {
	        return age;
	    }
	    public void displayRole() {
	        System.out.println("i'm a person");
	    }
	}




