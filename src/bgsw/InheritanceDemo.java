package bgsw;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee emp = new Employee("Vijay",1234,987664);
		OnRoleEmployee role = new OnRoleEmployee ("Rakesh",8765,5432.55,100000);
		
		Employee vijay= role;
		// polymorphoism 
		
		
		vijay.display();
		
				//emp.display();
				

		
		       // role.display();
		//role.display();

	}

}
