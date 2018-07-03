package liberry;

public class Book  extends  Item
{
	//private itemId; 
	private String title;
	private String author;
	
	public Book(String title, String author)
	{
		
		super();
		this.title = title;
		this.author = author;
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
