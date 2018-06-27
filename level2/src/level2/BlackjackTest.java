package level2;
import static org.junit.Assert.*;

import org.junit.Test;

public class BlackjackTest 
{

	
	
	
	@Test
    public  void blackJackTest()
	{
    	Blackjack blackJack = new Blackjack();
    	
	     
	      assertEquals(7, blackJack.blackJack(6,7));
	     
	}
	
	
	public void blackJackTest2()
	{
		Blackjack  b = new Blackjack();
		assertEquals(10, b.blackJack(8, 10));
	}
	
	
}
