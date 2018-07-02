package Tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;

import liberry.*;
import org.junit.Test;
import liberry.System;


public class SystemTest 
{

	System system = null;
	@Before
	public void createNewSystem()
	{
		system = new System();
	}
	
	@Test
	public void testAddMember()
	{
		
		Member member = new Member(1,"Member");
		Member member2 = new Member(2, "Member2");
		system.addMember(member);
		assertEquals(1,system.getMemberList().size());
	}
	
	@Test
	public void testRemoveMember()
	{
		
		Member memberOne = new Member(1,"Mark");
		 Member  memberTwo =  new Member(2,"Rachel");
		 Member  memberThee = new Member(3,"Lucy");
		 system.addMember(memberThee);
		 system.addMember(memberOne);
		 system.addMember(memberTwo);
		 system.removeMember(memberTwo);
		 assertEquals(2,system.getMemberList().size());
	}
	@Test
	public void testClearMember()
	{
		
		Member memberOne = new Member(1,"Mark");
		 Member  memberTwo =  new Member(2,"Rachel");
		 Member  memberThee = new Member(3,"Lucy");
		 system.addMember(memberThee);
		 system.addMember(memberOne);
		 system.addMember(memberTwo);
		 system.clearMember();
		 assertEquals(true,system.getMemberList().isEmpty());
	}
	
	@Test
	public void  testAddItem()
	{
		
		 Book book = new Book(1,"petter rabit", "Jame");
		 NewsPaper newsPaper = new NewsPaper(1,"Mancetsrer news", 1067 );
		 system.addItem(book);
		 system.addItem(newsPaper);
		 assertEquals(2, system.getItemList().size());
	}
	@Test
	public void testRemoveItem()
	{
		 Book book = new Book(1,"petter rabit", "Jame");
		 NewsPaper newsPaper = new NewsPaper(1,"Mancetsrer news", 1067 );
		 system.addItem(book);
		 system.addItem(newsPaper);
		 system.removeItem(book);
		 assertEquals(1, system.getItemList().size());
		 																							
	}
	
}
