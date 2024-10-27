package genric.classinterface;

/*
  Khai báo interface Ilist có tham số là generic type E
  --> generic interface
  -->E sẽ nhận vào là KDl đối tượng
  --> E được phép dùng trong {} của interface
 */
public interface IList<E> {

		void add(E e);
		
		void remove(E e);
		
		E get(int index );
		
		void set(int index, E e);
		
		int size();
		
		int capacity();
		
}
