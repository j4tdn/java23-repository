package inheritance.cclass;

import java.util.concurrent.Flow.Publisher;

public class TextBook extends Book {

	private Boolean isNew;
	private Double discount;
	
	public TextBook() {
	}
	public TexBook () {
	// this : đại diện cho đối tượng, ô nhớ hiện tại ở heap khi gọi hàm non static
	//		: khi thừa kế từ cha thì các hàm, thuộc tính của cha đã nằm trong con
	//		: ==> gọi được các hàm của chính nó và cha
	// super: dùng để gọi đến các thuộc tính, hàm (constructor, getter, setter non static 
	//        ở lớp cha
	super(id, name, salesPrice, publisher);
	}
	@Override
	public String toString() {
		return "TextBook  [id=" + getId() 
			+ ", name=" + getName() 
			+ ", salesPrice=" + getSalesPrice()
			+ ", publisher=" + getPublisher 
			+ \"]\";;
	}
	
	
}
