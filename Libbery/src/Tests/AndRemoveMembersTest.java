package Tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import liberry.Member;
import liberry.System;


public class AndRemoveMembersTest 
{

	System system = null;
	Member memberOne  = null;
	Member memberTwo = null;
	Member memberThree = null;
	
	@Before
	public void setUp()
	{
		 system = new System();
		 memberOne = new Member(1,"Member1");
		 memberTwo  = new Member(2, "Member2");
		 memberThree =  new Member(3,"Member3");
		 system.addMember(memberOne);
		 system.addMember(memberTwo);
    }
	@Test
	public void testAddMember()
	{
		system.addMember(memberThree);
		assertEquals(3,system.getMemberList().size());
	}
	@Test
	public void testRemoveMember()
	{
		 system.removeMember(memberTwo);
		 assertEquals(1,system.getMemberList().size());
		 
	}
	@Test
	public void testClearMember()
	{
		 system.clearMember();
		 assertEquals(true,system.getMemberList().isEmpty());
	}
	
	
	

}
