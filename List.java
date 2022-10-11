package assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	
	public static void main(String[] args) {
		java.util.List<String> list = new ArrayList<String>();
		list.add("Vishnu");
		list.add("Suraj");
		list.add("Priya");
		list.add("Thanga");
		list.add("Priya");
		list.add("Purush");
		list.add("Varada Rajan");

		list.add(1, "Karthik");
		list.set(0, "Charan");
		list.remove(5);
		System.out.println(list);
		int size = list.size();
		System.out.println("Size of the list " + size);
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			System.out.println(string);
		}

		System.out.println("**********************");

		Collections.sort(list);

		for (String testleaf : list) {
			System.out.println(testleaf);
		}

		list.clear();
		list.isEmpty();
		boolean contains = list.contains("Charan");

	}
}
