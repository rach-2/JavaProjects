package tests;

import static org.junit.Assert.*;
import tooHot.TooHot;

import org.junit.Test;

public class TooHotTest {

	@Test
	public void test() 
	{
		TooHot  tooHot = new TooHot();
		assertEquals(true,tooHot.tooHot(60, false));
	}

}
