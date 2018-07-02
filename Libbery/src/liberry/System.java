package liberry;
import java.util.ArrayList;
public class System 
{
	
	private ArrayList<Member> memberList = new ArrayList<Member>();

	public boolean addMember(Member m) 
	{
	      return memberList.add(m);
	}
	
	public boolean removeMember(Member m)
	{
		return memberList.remove(m);
	}
	
	public ArrayList<Member> getMemberList()
	{
		return memberList;
	}
	
	public void clearMember()
	{
		 memberList.clear();
	}
	
}
