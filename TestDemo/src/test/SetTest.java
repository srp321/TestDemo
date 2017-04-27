package test;

import java.util.*;

public class SetTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String []args) {
		
		TreeSet sety = new TreeSet();
		sety.add("2");
		sety.add(1);
		sety.add("3");
		
			sety.forEach(System.out::println);

		
		
	}
}
