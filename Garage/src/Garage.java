import java.util.ArrayList;
public class Garage 
{
	
	//createing 
	private ArrayList<Vehclie> vechileList = new ArrayList<Vehclie>();

	 public int  iterateVechiles()
	{
		int bill = 0;

		for (Vehclie v : vechileList)
		{
			
		      if (v.getClass().getName() == "Car")
		      {
		    	  
		    	  Car tempCar = (Car) v;
		    	 if (tempCar.getMake()=="Ford")
		    	 {
		    		 bill =  bill + 100;
		    	 }
		    	 else if(tempCar.getMake() == "Mini")
		    	 {
		    		 bill = bill + 200;
		    	 }
		    	 
		      }
		    	 
		      else if (v.getClass().getName() == "Plane")
		      {
		           Plane tempPlane = (Plane) v;
		           
		           if (tempPlane.getWingCapicity() == 100)
		           {
		        	   bill  = bill + 100;
		           }
		           else if(tempPlane.getWingCapicity() == 200)
		           {
		        	   bill = bill + 150;
		           }
		    	  
		      }
		      else if(v.getClass().getName()=="MoterBike")
		      {
		    	  //this is casting  the code
		    	  MoterBike tempMoterBike = (MoterBike) v;
		          if(tempMoterBike.getNumberOfCruthes() == 5)
		          {
		    	  bill = bill + 50;
		          }
		          else if(tempMoterBike.getNumberOfCruthes() == 2)
		          {
		        	  bill = bill + 25;
		          }
		          
		  }
		    
		}
		
			
		return bill;
		
	}
	public boolean addVechile(Vehclie vechile)
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
