package liberry;

public class NewsPaper implements Item
{
	int newsPaperId;
	String newsPaperTitle;
	int issueNumber;
	
	public NewsPaper(int newsPaperId, String newsPaperTitle, int issueNumber) 
	{
		this.newsPaperId = newsPaperId;
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

	@Override
	public int getItemId() 
	{
		return newsPaperId;
	}
	
	
	
}
