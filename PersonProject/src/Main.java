import java.util.ArrayList;
public class Main 
{

	private  ArrayList<Person> personArrayList = new ArrayList<Person>();
	
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Person person = new Person("Rachel",26,"IT consuldent");
		System.out.println(person.toString());
		
		Main m = new Main();
		
		Person rachel = new Person("Rachel", 26,"IT Consuldent");
		Person john = new Person("John",33 ,"techer");
		m.personArrayList.add(john);
		m.personArrayList.add(rachel);
		// System.out.println(m.outPutPeople());
		 System.out.println(m.search("Rachel"));
		    
		
	}
	
//	private String  outPutPeople()
//	
//	{
//		  
//		for(Person p  : personArrayList )
//		{
//			return p.toString();
//		}
//		
//		return null;
//		
//   }
//	
	
	private String search(String s)
	
	{
		String string = "";
		//Iterates though the personarray list
		for(Person p : personArrayList)
		{
			
			if (p.getName().equals(s))
			{
				string  = s;
			}
		}
		return string;
		
	}
	

}
