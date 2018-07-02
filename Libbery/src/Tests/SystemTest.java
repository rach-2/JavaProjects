package Tests;
import static org.junit.Assert.*;

import org.junit.Before;

import liberry.*;
import org.junit.Test;
import liberry.System;


public class SystemTest 
{

	@Before
	public void createNewSystem()
	{
		system = new System();
	}
	System system = null;
	@Test
	public void testAddMember()
	{
		
		Member member = new Member(1,"Member");
		system.addMember(member);
		assertEquals(system.getMemberList().size(), 1);
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
		 assertEquals(system.getMemberList().size(),2);
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
		 System system = new System();
		 Book book = new Book(1,"petter rabit", "Jame");
		 NewsPaper NewsPaper = new Newspaper(1,"Mancetsrer news", 1067 );
		 system.addItem(book,list
		 system.add
		 
		 
		 
	}
	
}
