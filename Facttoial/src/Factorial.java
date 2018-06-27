
public class Factorial 
{

	public static void main(String[] args) 
	{
		//creating a new factoiriol
		Factorial f = new Factorial();
		
		System.out.println(f.factorial(10));

	}
	
	
	private String  factorial(int number)
	{
		
		//int number = 0;
		
		String s = "";
	    int i = 120;
	    //doing while i is getter then one
		while(i > 1)
		{
			int j = 0;
			//checking if the j  is less then number
			while(j < number)
			{
				//checks if  numbers
				if(number/i == 1)
				{
				 //prints out a string 
				s =  i + " is a factorial";
				}
				j++;
			}
			i--; 
		}
		return s;
		
	     
	}
	

}
