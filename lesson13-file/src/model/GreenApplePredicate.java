package model;

import java.util.function.Predicate;

import bean.Apple;

public class GreenApplePredicate implements Predicate<Apple> {

	@Override
	public boolean test(Apple t) {
		return "green".equals(t.getColor());
	}

}
