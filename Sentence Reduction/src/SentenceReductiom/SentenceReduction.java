package SentenceReductiom;

public class SentenceReduction 
{    
	public static void main(String[] args) 
	{
		SentenceReduction s = new SentenceReduction();
		s.comprisen("hi there");
	}
		public String comprisen(String string)
		{
			
			//
	
			String[] temp = string.split(" ");
			System.out.println(temp);
			
			System.out.println(temp);
			
			boolean charMatch = false;
			String redureString = "";
			 
			while(!charMatch)
			{
				for(int i = 1; i<string.length(); i++)
				{
					 if (
					{
						 string.substring(i-1, i);
						 redureString = redureString+ " "; 
						 
		
				    }
					 
				}
				
			
			}
			 
			return string;
		}



}