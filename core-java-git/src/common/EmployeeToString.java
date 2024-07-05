package common;

/**
 * 52.Create Employee Object and display it’s data using toString that is only
 print e and it should display all the data of that object

 */
public class EmployeeToString {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("Sam");
		e.setSal(10000);
		System.out.println(e);// updated Employee class to override toString() 
	}

}
