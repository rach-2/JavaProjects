package test;

import static org.junit.Assert.*;

import org.junit.Before;

import  SentenceReductiom.SentenceReduction;

import org.junit.Test;

public class SentenceReductionTest {

	SentenceReduction sentenceReduction = null;
	@Before 
	public void setUp()
	{
		sentenceReduction = new SentenceReduction();
	}
	@Test
	public void testComprisen() 
	{
		
		assertEquals("Deepisodes of Deep Space Nine came on the televisionly after the news.", 
				sentenceReduction.comprisen("Deep episodes of Deep Space Nine came on the television only after the news"));
	}

}
