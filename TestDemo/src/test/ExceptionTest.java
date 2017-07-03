package test;

import java.nio.file.AccessDeniedException;

public class ExceptionTest {

	@SuppressWarnings("finally")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int val = 0;
		try {
			ExceptionTest et = new ExceptionTest();
			et.NewException();
			System.out.println("in try");
			if (val == 0)
				throw new ArithmeticException();

		} catch (Exception e) {
			System.out.println("in catch");
			e.printStackTrace();
			throw new Exception();
		} finally {
			System.out.println("IN FINALLY ");
			throw new NumberFormatException();
		}

	}

	public void NewException() throws AccessDeniedException {
		System.out.println("in method");
		throw new AccessDeniedException("say what");
		/*
		 * try { System.out.println("in method"); throw new
		 * AccessDeniedException("say what"); } catch (AccessDeniedException e)
		 * { // TODO Auto-generated catch block System.out.println("in catchie"
		 * ); }
		 */
	}
}
