package bgsw;

public class Employee {

	// data member
	// encasulation 
	
	private String empName;
	private int empId;
	private double salary;
	
	
	String fatName;
	// 
	
	
	
	/**
	 * @param empName
	 * @param empId
	 * @param salary
	 */
	public Employee(String empName, int empId, double salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}


	
	
	/**
	 * 
	 */
	public Employee() {
		super();
	}




	// member method 
	
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}


	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		
		if(empName.length()>=3)
		this.empName = empName;
		else
		{
			System.out.println(" Invalid Emp Name ");
			this.empName="bgsw";
		}
	}


	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}


	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		
		if(empId >=1000 && empId<=9999)
		this.empId = empId;
		else
			this.empId=1000;
	}


	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		
		if(salary>=20000 && salary <=50000)
		this.salary = salary;
		else {
			this.salary =25000;
		}
	}


	double calculateGrossSalary(){
		
		// hra
		
		double hra= salary*.3;
		double da= salary*.6;
		double pf= salary*.1;
		
		double gs= salary+hra+da-pf;
		
		return gs;
	}
	
	
	void display (){
	
		System.out.println(" Employee Id "+ empId);
		System.out.println(" Employee Name "+ empName);
		System.out.println(" Basic  Salary "+ salary);
		
		
	}
	
	
	
	
	

}
