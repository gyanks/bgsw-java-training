package bgsw;

import bgsw.client.RB;
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RB obj;
		
		
		// Instance of Class
		// reference 
		Employee emp;
		// allocating memory 
		emp = new Employee();
		
		emp.setEmpId(1004);
		emp.setEmpName("Krishna");
		emp.setSalary(30650);
		// abstraction 
		
		//emp.calculateGrossSalary();
		
		double gs= emp.calculateGrossSalary();
		
		/*
		emp.empId=10;
		emp.empName="V";
		emp.salary=-76543.23;
		*/
		
		
		emp.display();
		
		
		Employee emp1= new Employee("Pawan",543,65432);
		
		/*
		 * emp1.setEmpId(7654); emp1.setEmpName("pawan "); emp1.setSalary(45321);
		 */
		double gs1= emp1.calculateGrossSalary();
		
		emp1.display();
		System.out.println(" Gross Salary "+ gs1 );

	}

}
