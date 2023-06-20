class app// create app class 
{

	 public void fp() // create a method
	{
		System.out.println("ravi");// print the statement 
	}
} 

public class manish// create manish  class
{
	public static void main(String [] args) //create main(), entry of the program
	{
		System.out.println("deepak");

		app obj = new app(); // create app class object  
		obj.fp(); // call return method
	} 
}
