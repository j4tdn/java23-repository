package functional;

import java.util.function.Consumer;

import bean.Apple;

public class SumConSumer implements Consumer<Apple> {
	private Double sum;
	public SumConSumer (Double sum) {
		this.sum = sum;
	}
	@Override
	public void accept(Apple t) {
		// TODO Auto-generated method stub
		
	}

}
