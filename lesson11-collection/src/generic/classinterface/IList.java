package generic.classinterface;

/*
 * Khai báo interface IList có tham số genericType E
 * -> generic interface
 * -> E sẽ nhận vào là KDL object
 * -> E được phép dùng trong {} của interface
 */

public interface IList<E> {

	void add(E e);

	void remove(E e);

	E get(int index);

	void set(int index, E e);

	int size();

	int capacity();
}
