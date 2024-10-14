package generic.classinterface;
/*
 * Khai báo interface IList có tham số là generic type E
 * -> generic interface
 * -> E sẽ nhận vào là KDL đối tượng 
 * -> E được phép dùng trong {} của interface
   */
public interface IList<E> {
	void add(E e);
	void remove(E e);
	E get(int index);
	void set(int index, E e);
	int size();
}
