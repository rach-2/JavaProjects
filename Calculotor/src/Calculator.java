
public class Calculator 
{
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		System.out.println(calculator.sums(20, 11, 9));
		
		
	}
	
	private String  sums(int number1, int number2, int number3)
	{
		String sumString="";
		 if(number1 + number2 == number3)
		 {
			 sumString = number1 + " + " + number2 + " = " + number3;
			 sumString 
		 }
		 
		 else if(number1 + number3 == number2)
		 {
			 sumString = number1 + " + " + number3 + " = " + number2; 
		 }
		 
		 else if(number2 + number3 == number1)
		 {
			 sumString = number2 + " + " + number3 + " = " + number1; 
		 }
		 else if(number1 - number2 == number3)
		 {
			 sumString = number1 + " - "  + number2 + " = "  + "";
			 sum
		 }
		 return sumString;
	}

}
