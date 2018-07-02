
public class Plane extends Vehclie
{
	private int wingCapicity;
	
    public Plane(int wingCapcity)
	{
		this.wingCapicity = wingCapcity;
	}
	
	public int  getWingCapicity()
	{
		return wingCapicity;
	}

	@Override
	public String start() 
	{
		return "The Plane has Started";
    }
}
