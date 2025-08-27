package persistence;



	public class Class {

	    private Integer id;

	    private String name;
	    

	    private String teacher;
	    public Class() {
	    	
	    }

		public Class(Integer id, String name,String teacher) {
			this.id = id;
			this.name = name;
			this.teacher = teacher;
		}

		@Override
		public String toString() {
			return "student [id=" + id + ", name=" + name + ", teacher=" + teacher + "]";
		}




	    
	    
	}