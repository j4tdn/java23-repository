package functional;

@FunctionalInterface
//Interface có duy nhất một hàm trừu tượng
public interface IntOperator {

	int strategy(int a, int b);

}
