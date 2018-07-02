package liberry;

public class Book  implements  Item
{
	private int bookId;
	private String title;
	private String author;
	
	public Book(int bookId, String title, String author)
	{
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	
	@Override 
	public int getItemId() 
	{
		return bookId;
	}

	public String getTitle() 
	{
		return title;
	}
	
	public String getAuthor() 
	{
		return author;
	}
	
      
}
