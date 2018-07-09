package com.qa.libeery;
import java.util.ArrayList;
public class System implements addMember
{
	
	private ArrayList<Member> memberList = new ArrayList<Member>();
	private ArrayList<Item> itemList = new ArrayList<Item>();
	
	
	public boolean removeMember(Member member)
	{
		return memberList.remove(member);
	}
    
	public ArrayList<Member> getMemberList()
	{
		return memberList;
	}
	
	public void clearMember()
	{
		 memberList.clear();
	}
	
	public boolean addItem(Item item)
	{
		return itemList.add(item);
	}
	
	public  boolean removeItem(Item item)
	{
		return itemList.remove(item);
	}
	
	public void clearItem()
	{
		itemList.clear();
	}
	
	public ArrayList<Item> getItemList()
	{
		return itemList;
	}

	@Override
	public boolean addMember(Member member) 
	{
		return memberList.add(member);
	}
}
