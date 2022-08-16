package bgsw;

public class OnRoleEmployee extends Employee  {

	
	private int insurancePolicy;
	

	
	

	/**
	 * @param empName
	 * @param empId
	 * @param salary
	 * @param insurancePolicy
	 */
	public OnRoleEmployee(String empName, int empId, double salary, int insurancePolicy) {
		// calling constructor of base class 
		super(empName, empId, salary);
		this.insurancePolicy = insurancePolicy;
	}

	/**
	 * @return the insurancePolicy
	 */
	public int getInsurancePolicy() {
		return insurancePolicy;
	}

	/**
	 * @param insurancePolicy the insurancePolicy to set
	 */
	public void setInsurancePolicy(int insurancePolicy) {
		this.insurancePolicy = insurancePolicy;
	}
	
	
	public  void display() {
		
		super.display();
		System.out.println(" Insurance Policy "+ insurancePolicy);
		
	}
	
	
}
