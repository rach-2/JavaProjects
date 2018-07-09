package Tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MemberTest 
{
	Member member = null;
	Book   bookOne = null;
	Book   bookTwo = null;
	
	@Before
	public void setUP()
	{
		member = new Member(1,"Rachel");
		bookOne =  new Book("peter Rabit","James");
		bookTwo = new Book("HarryPoter", "JK Rooling");
		member.checkOutItem(bookOne);
		member.checkOutItem(bookTwo);
	}
	
	@Test
	public void testCheckOutItem()
	{
			Book bookThree = new Book("Lord of the Rings", "someone");
		   member.checkOutItem(bookThree);
		   assertEquals(3, member.getMemberItems().size());
	}
	@Test
	public void testCheckInItem()
	{
		   member.checkInItem(bookTwo);
		   assertEquals(1,member.getMemberItems().size());
	}
	@Test
	public void testUpdateMember()
	{
		 member.updateMember("Sarah");
		 assertEquals("Sarah",member.getMemberName());
	}
}


