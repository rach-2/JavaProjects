

public class Person    
{
	private String name;
	private  int age;
	private String jobTilte;
	
	
	
	public Person(String name, int age, String jobTitle)
	{
		this.name = name;
		this.age = age;
		this.jobTilte = jobTitle;
	}
	
	public String toString()
	{
		String string = "Name: " +  age + "age: " + age + "Job Tilte: " + jobTilte;
		return string;
		
		
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	
	
	
	
	

}
