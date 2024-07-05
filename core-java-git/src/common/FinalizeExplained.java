package common;

/**
 * 59.Write a program which will explain finalize method

 */
public class FinalizeExplained {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("Sam");
		e.setSal(1000);
		
		System.out.println(e);
		e = null;
		System.gc();// updated Employee to override finalize method
	}

}
