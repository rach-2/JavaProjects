package liberry;

public class Book  implements  Item
{
	private int bookId;
	private String title;
	private String author;
	
	public Book(int bookId, String title, String auhtor)
	{
		
	}
	@Override 
	public int getItemId() 
	{
		// TODO Auto-generated method stub
		return bookId;
	}
      
}
