package tooHot;



public class TooHot 
{
	public static void main(String args[])
	{
	TooHot tooHot = new TooHot();
		
		System.out.println(tooHot.tooHot(50, false));
         
	}
	
	public boolean tooHot(int temp, boolean isSummer)
	{
		 boolean tooHot;
		 //checks if the varrible too hot is true
		if (isSummer)
		{
			//checks if temp is bettween 60 and 100
			if(temp >= 60 && temp <=100)
			{
				tooHot = true;
			}
			else
			{
				tooHot = false;
			}
				
			
		}
		else
		{
			if(temp >= 60 && temp <=90)
			{
				tooHot = true;
			}
			else
			{
				tooHot = false;
			}
			
			
		}
		return tooHot;
	}
	 

	
}
