
public class Car  extends  Vehclie
{
    private String model;
    private String make;
     
    
    public Car(String model, String make)
    {
    	this.model = model;
    	this.make = make;
    }
    
    public String  getModel()
    {
    	return this.model;
    }

	public String getMake() 
	{
		return this.make;
		
	}

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return null;
	}
    
    

    
    
}
