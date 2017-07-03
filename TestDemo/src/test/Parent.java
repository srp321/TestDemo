package test;

class Demo {
	public static void main(String[] args) {
		Child1 pr2 = new Child1();
		// Child1 pr2 = (Child1) new Parent();
		pr2.abc();
	}
}

interface Parent1 {
	public void abc();
	// public void abcd();
}

interface Parent2 {
	public void abc();
	// public void abcd();
}

class Child1 implements Parent1, Parent2 {

	public void abc() {
		System.out.println("Child12");
	}
}

class Child2 extends Child1 {
	public void abc() {
		System.out.println("Child22");
	}
}
