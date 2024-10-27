package generic.classinterface;

/* 
    Khai báo interface IList co tham số là generic type E  
  	E là generic type
 ---> E sẽ nhận vào là KDL đối tượng
 ---> E được phép dùng trong {} của interface
 */

public interface IList<E> {
 
	// Các hàm 
	void add(E e);
	void remove(E e);
	
	E get(int index);
	
	void set(int index, E e);
	
	int size();

	int capacity();
}
