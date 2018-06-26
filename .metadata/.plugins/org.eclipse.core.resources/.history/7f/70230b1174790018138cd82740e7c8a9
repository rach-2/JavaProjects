package level2;

public class Blackjack 
{
	//main method
	public static void main(String args[])
	{
		Blackjack blackJack = new Blackjack();
		System.out.println(blackJack.blackJack(10, 6));
		System.out.println(blackJack.uquie(3,4,5));
	}
	
	//checks if number                                                 
	private int blackJack(int number1,int number2)
	{
		int i = 0;
		if (21- number1 <  21 - number2)
		{
			i = number1; 
		}
		else if (21 - number2 < 21 - number1)
		{
			i = number2;
		}
		else if(number1 > 21 && number2 > 21)
		{
			i = 0;
		}
		
		
		
		
		return i;
	}
	
	/*
	 * this metthod
	*/
	private  int uquie(int number1, int number2, int number3)
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
