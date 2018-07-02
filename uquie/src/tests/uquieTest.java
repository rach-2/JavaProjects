package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import uquie.Uquie;

public class uquieTest {

	@Test
	public void testUquie() 
	{
		Uquie uquie  = new Uquie();
		assertEquals(3,uquie.uquie(2, 1 ,2));
	}

}
