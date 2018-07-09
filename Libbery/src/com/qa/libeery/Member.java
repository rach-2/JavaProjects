package com.qa.libeery;
import java.util.ArrayList;


public class Member 
{
	  
	 private int memberId;
	 private String memberName;
	 private ArrayList<Item> memberItems;
	 
     public Member(int memberId, String memberName)
     {  
    	 this.memberId = memberId;
    	 this.memberName = memberName;
    	 this.memberItems =  new ArrayList<Item>();
     }
     
     //adding an item to the membersItems
     public boolean checkOutItem(Item item)
     {
    	  return memberItems.add(item);
     }
     
     public boolean checkInItem(Item item)
     {
    	  return memberItems.remove(item);
     }
     
     public ArrayList<Item> getMemberItems()
     {
    	 return memberItems;
     }
     public String getMemberName()
     {
    	 return memberName;
     }
     public void updateMember(String name)
     {
    	 this.memberName = name;
     }

}