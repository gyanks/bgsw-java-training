package bgsw.exce;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		
		int num1=100;
		
		int num2=10;
		
		int [] data = new int[5];
		
		int age = 220;
		// age >= 18  --- age<= 60 
		try
		{
			System.out.println(" inside try block ");
		  
			data[4] = num1/num2;
		
		    System.out.println(" Result is "+data[4]);
		    if(! (age>=18 && age<=60))
		    	 throw new AgeException();
		    
		    
		    System.out.println(" I am Ganendra "+age);
		}
		
		


		catch(ArithmeticException ex) {
			System.out.println(" Inside exception division by zero");
		}
		
		
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(" Array exception out of bound  ");
		}
		
		catch (AgeException ex) {
			System.out.println(" Please check age of employee ");
		}
		catch(RuntimeException rext) {
			
			
		}
		
		catch (Exception ex) {
			
			System.out.println(" inside ..... ");
		}
		
				  System.out.println(" Thanks we are having fun ");

	}

}
