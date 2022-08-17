package bgsw;

public interface SecuritySpecInteface {
	
	//public void sslImplementation();
	
	// java 8   default menthod 
	
	public default  void singleSignOn() {
		System.out.println(" This is default definition in interface ");
	}
		
	
	
	
	
	public int method1(int num1 , int num2);
	

}
