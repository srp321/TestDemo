package test;

import java.util.*;

public class SetTest {
	@SuppressWarnings("rawtypes")
	public static void main(String []args) {
		
		Set<Comparable> sety = new TreeSet<Comparable>();
		sety.add("2");
		sety.add(1);
		sety.add("3");
		
			sety.forEach(System.out::println);

		
		
	}
}
