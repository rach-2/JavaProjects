package Tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;

import liberry.*;
import org.junit.Test;

import com.qa.libeery.Book;
import com.qa.libeery.NewsPaper;
import com.qa.libeery.System;


public class SystemTest 
{

	 System system = null;
	 Book book =  null;
	 NewsPaper newsPaper =  null;
	 Book bookTwo = null;
	@Before
	public void createNewSystem()
	{
		  system = new System();
		  book = new Book("petter rabit", "Jame");
		  newsPaper = new NewsPaper("Mancetsrer news", 1067);
		  bookTwo = new Book("Cahrile in the choclate Fatcotty", "RholDare");
		  system.addItem(book);
		  system.addItem(newsPaper);
	}

	@Test
	public void  testAddItem()
	{
		 system.addItem(bookTwo);
	     assertEquals(3, system.getItemList().size());
	}
	@Test
	public void testRemoveItem()
	{
		 system.removeItem(book);
		 assertEquals(1, system.getItemList().size());
		 																						}
	@Test
	public  void testClearItems()
	{
		 system.clearItem();
		 assertEquals(true,system.getItemList().isEmpty());
	}
	
}
