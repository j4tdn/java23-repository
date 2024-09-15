package Ex01Students;

public class Students {

	private int ID;
	private String Name;
	private Arrange Arrange;

	public Students(int id, String name, Arrange c) {
		super();
		ID = id;
		Name = name;
		Arrange = c;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setArrange(Arrange arrange) {
		Arrange = arrange;
	}

	public Ex01Students.Arrange getArrange() {
		// TODO Auto-generated method stub
		return null;
	}

}
