package liberry;

public class NewsPaper extends Item
{
	int newsPaperId;
	String newsPaperTitle;
	int issueNumber;
	
	public NewsPaper(int newsPaperId, String newsPaperTitle, int issueNumber) 
	{
		supper();
		this.newsPaperTitle = newsPaperTitle;
		this.issueNumber = issueNumber;
	}
	
	public String getNewsPaperTitle() 
	{
		return newsPaperTitle;
	}

	public int getIssueNumber() 
	{
		return issueNumber;
	}

	 public int getItemId() 
	{
		return newsPaperId;
	}
	
	
	
}
