package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex04ArraySorting {

	public static void main(String[] args) {

		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		System.out.println("Original string: " + Arrays.toString(strings));

		System.out.println();
		sortAscending(strings);
		System.out.println();
		sortDescending(strings);

	}

	private static List<List<String>> classifyAndSort(String[] strings, boolean isAscending) {
		List<String> negatives = new ArrayList<>();
		List<String> positives = new ArrayList<>();
		List<String> characters = new ArrayList<>();
		List<String> special = new ArrayList<>();
		List<String> nulls = new ArrayList<>();

		for (String s : strings) {
			if (s == null) {
				nulls.add(s);
			} else if (s.equalsIgnoreCase("Special")) {
				special.add(s);
			} else if (isNegativeNumber(s)) {
				negatives.add(s);
			} else if (isPositiveNumer(s)) {
				positives.add(s);
			} else {
				characters.add(s);
			}
		}

		if (isAscending) {
			Collections.sort(negatives);
			Collections.sort(positives);
			Collections.sort(characters);
		} else {
			Collections.sort(negatives, Collections.reverseOrder());
			Collections.sort(positives, Collections.reverseOrder());
			Collections.sort(characters, Collections.reverseOrder());
		}

		List<List<String>> classifiedGroups = new ArrayList<>();
		classifiedGroups.add(special);
		classifiedGroups.add(negatives);
		classifiedGroups.add(positives);
		classifiedGroups.add(characters);
		classifiedGroups.add(nulls);

		return classifiedGroups;

	}

	private static void sortAscending(String[] strings) {

		List<List<String>> sortedGroups = classifyAndSort(strings, true);

		int[] printOrder = {0, 1, 2, 3, 4};
		printSortedResult(sortedGroups, "Ascending: ", printOrder);

	}

	private static void sortDescending(String[] strings) {

		List<List<String>> sortedGroups = classifyAndSort(strings, false);

		int[] printOrder = {4, 3, 2, 1, 0};
		printSortedResult(sortedGroups, "Descending: ", printOrder);
		
	}
	
	private static void printSortedResult(List<List<String>> sortedGroups, String orderType, int[] printOrder) {
		System.out.println(orderType + ": ");
        for (int index : printOrder) {
            sortedGroups.get(index).forEach(s -> System.out.print(s + " "));
        }
        System.out.println();
	}

	private static boolean isNegativeNumber(String s) {
		try {
			return Integer.parseInt(s) < 0;
		} catch (NumberFormatException e) {
			return false;
		}

	}

	private static boolean isPositiveNumer(String s) {
		try {
			return Integer.parseInt(s) > 0;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}