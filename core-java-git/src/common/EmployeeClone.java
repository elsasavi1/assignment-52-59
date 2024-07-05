package common;

/**
 * 58.Create an employee object with some data and create a clone of it 
 * and display data from the cloned object.

 */
public class EmployeeClone implements Cloneable{

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setId(1);
		e1.setName("Pam");
		e1.setSal(1000);
		
		Employee e2 = e1.clone();//updated Employee class to override clone()
		System.out.println(e2);

	}
	
    

}
