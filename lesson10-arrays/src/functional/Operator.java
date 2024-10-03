package functional;

@FunctionalInterface
//Interface có duy nhất một hàm trừu tượng
public interface Operator {

	int strategy(int a, int b);

}