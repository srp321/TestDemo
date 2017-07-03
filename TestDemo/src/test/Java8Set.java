package test;

import java.util.*;

public class Java8Set {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String []args) {
		
		Set<String> sety = new HashSet<String>();
		sety.add("2");
		//sety.add(1);
		sety.add(new Integer(1).toString());
		sety.add("3");
		
		sety.forEach(System.out::println);

		
		Set sety2 = new HashSet();
		sety2.add("qwerty");
		sety2.add(new Integer(12));
		
		sety2.forEach(System.out::println);
	}
}
