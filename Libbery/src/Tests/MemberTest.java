package Tests;

import static org.junit.Assert.*;
import org.junit.Before;
import liberry.Member;
import org.junit.Test;
import liberry.Book;

public class MemberTest 
{
	Member member = null;
	Book   bookOne = null;
	Book   bookTwo = null;
	@Before
	public void setUP()
	{
		member = new Member(1,"Rachel");
		Book   bookOne =  new Book();
		Book   bookTwo = new Book();
		
	}
	@Test
	public void checkOutItem()
	{
		  
	}
}


