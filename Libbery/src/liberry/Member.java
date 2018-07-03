package liberry;
import java.util.ArrayList;


public class Member 
{
	  //
	 private int memberId;
	 private String memberName;
	 private ArrayList<Item> memberItems;
	 
     public Member(int memberId, String memberName)
     {  
    	 this.memberId = memberId;
    	 this.memberName = memberName;
    	 this.memberItems =  new ArrayList<Item>();
  
    }
     
    
     
     
}
