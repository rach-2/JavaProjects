package com.qa.libeery;

public class NewsPaper extends Item
{
	int newsPaperId;
	String newsPaperTitle;
	int issueNumber;
	
	public NewsPaper(String newsPaperTitle, int issueNumber) 
	{
		super();
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


	
	
	
}
