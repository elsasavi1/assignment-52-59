package common;

/**
 * 55.Create two employee objects with same data and compare two object(data)
 */
public class CompareEmployees {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setId(1);
		e1.setName("Sam");
		e1.setSal(1000);
		
		e2.setId(1);
		e2.setName("Sam");
		e2.setSal(1000);
		
		System.out.println(e1.equals(e2));//updated Employee class to override equals()

	}

}
