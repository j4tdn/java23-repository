package generic.classinterface;

/*
  Khai báo interface IList có tham số là 1 generic type E
  --> generic interface
  --> E sẽ nhận vào là KDL đối tượng
  --> E được phép dùng trong {} của interface
 */
public interface IList<E> { // E: generic type
	
	void add(E e);
	
	void remove(E e);
	
	E get(int index);
	
	void set(int index, E e);
	
	int size();
	
	int capacity();

}
