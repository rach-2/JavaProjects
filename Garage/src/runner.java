
public class runner 
{

	public static void main(String[] args) 
	{
		
		
		Garage garage = new Garage();
		Car car1 = new  Car("vistea", "ford");
		garage.addVechile(car1);
		Car car2 = new Car("Mini","Mini");
		Plane Plane = new Plane(100);
		garage.addVechile(car2);
		garage.addVechile(Plane);
		
		
		System.out.println("the bill is " + garage.iterateVechiles());
	}

}
