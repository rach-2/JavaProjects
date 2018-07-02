
public class MoterBike extends Vehclie 
{
	int numberOfCruthes;
	
    public MoterBike(int numberOfCruthes)
    {
    	 this.numberOfCruthes = numberOfCruthes;
    }
    
    public int  getNumberOfCruthes()
    {
    	return this.numberOfCruthes;
    }

	@Override
	public String start() 
	{
		return "The MoterBike has Started";
	}
    
    
    
   
   
    	
   

}
