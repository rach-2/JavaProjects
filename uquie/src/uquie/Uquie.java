package uquie;

public class Uquie 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	}


public   int uquie(int number1, int number2, int number3)
{
	int i = 0;
	if (number1 == number2 || number1 == number3)
	{
		i = number2 + number3;
	}
	else if(number3 == number2 || number3 == number1)
	{
	    i = number1 + number2;
	}
	
	else if(number1 == number3 &&  number1 == number2 && number2 == number3)
	{
		 i = 0;
	}
	
	else
	{
		i  = number1 + number2 +  number3; 
	}
	return i;
	
}
}