package generic.classinterface;

/**
 * khai báo Ilist có tham số là generic type 
 * --> generic interface
 * --> E được phép dùng trong () của interface 
 */
public interface Ilist <E> {

	void add (E e);
	
	void remove (E e);
	
	E get (E e);
	
	void set (E e);
	
	int size (E e);
	
	int capacity(E e);
	
}
