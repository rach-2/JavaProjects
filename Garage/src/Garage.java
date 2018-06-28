import java.util.ArrayList;
public class Garage 
{
	
	ArrayList<Vehclie> vechileList = new ArrayList<Vehclie>();

	
	public ArrayList<Vehclie> iterateVechiles()
	{
		return vechileList;
	}
	boolean addVechile(Vehclie vechile)
	{
		return vechileList.add(vechile);
	
		
	}
	
	
	
	public boolean removeVechile(Vehclie vechile)
	{
		return vechileList.remove(vechile);
	}
	
	public void clearGarage()
	{
		  vechileList.clear();
		  
	}
	
	
	

}
