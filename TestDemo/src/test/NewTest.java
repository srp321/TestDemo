package test;

import java.util.*;

class NewTest<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) {
    	this.t = t; 
    }
    public T get() {
    	return t; 
    }
    public static void main(String []args) {
    	Currency.NICKLE.setValue(100);
    	System.out.println(Currency.DIME.getValue());
    	System.out.println(Currency.NICKLE.getValue());
    	
    	ArrayList<String> numbers = new ArrayList<String>(); 
    	numbers.add("abc"); 
    	numbers.add("pqr"); 
    	numbers.add("xyz"); 
    	
    	//ArrayList size dynamically re-sizes to 1 less when 1 removed
    	System.out.println("ArrayList contains : " + numbers); 
    	numbers.remove(1); 
    	System.out.println("ArrayList contains : " + numbers); 
    	//numbers.remove(1);
    	numbers.remove(new Integer(3));
    	System.out.println("ArrayList contains : " + numbers); 
    	
    	Set<ABC> st = new HashSet<>();
    	ABC ab1 = null;
    	ABC ab2 = null;
    	st.add(ab1);
    	st.add(ab2);
    	
    	System.out.println("val:"+st.size());
    	
    	
    }
}

class ABC {
	private String ab;

	public String getAb() {
		return ab;
	}

	public void setAb(String ab) {
		this.ab = ab;
	}
	
}


enum Currency { 
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25); 
	private int value; 
	private Currency(int value) { 
		this.value = value; 
		}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	} 
	
	}; 
