package persistence;

	public class student {

	    private Integer id;


	    private String name;
	    

	    private String gender;
	    public student() {
	    	
	    }

		public student(Integer id, String name,String gender) {
			this.id = id;
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
		}




	    
	    
	}