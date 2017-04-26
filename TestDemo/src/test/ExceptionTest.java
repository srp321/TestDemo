package test;

public class ExceptionTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int val=0;
		try {
			if (val==0)
				throw new ClassCastException();
			System.out.println("in try");
		}
		catch (Exception e){
			System.out.println("in catch");
			throw new Exception();
		}
		finally {
			System.out.println("IN FINALLY ");
			throw new NumberFormatException();
		}
		
	}
}
