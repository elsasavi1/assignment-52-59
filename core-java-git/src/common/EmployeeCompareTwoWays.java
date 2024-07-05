package common;

/**
 * 57.Create two employee objects and compare it’s references using == and equals


 */
public class EmployeeCompareTwoWays {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setId(1);
		e1.setName("Pam");
		e1.setSal(1000);
		
		e2.setId(1);
		e2.setName("Pam");
		e2.setSal(1000);
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));

	}

}
