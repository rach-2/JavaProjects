import java.util.ArrayList;
public class HelloWorld 
{

	public static void main(String[] args)
	{
		
		int[]  array = {1,2,3,4,6,5,7,8,9,10};
		
		 String helloWorld = "hello world";
		System.out.println("Hello World!");
		 System.out.println(helloWorld);
		  
		 HelloWorld hello = new HelloWorld();
		 hello.printString("hi");
		 hello.helloWorld();
		 System.out.println(hello.printInt(3,0,true));
		
		 for(int i = 0; i <10; i++)
		 {
			 System.out.println(hello.printInt(6,i,true));
			 
		 }
		 
		 for(int i = 0; i <10; i++)
		 {
			 System.out.println(hello.printInt(array[i],2,true));
			 
		 }  
		 
		 for(int i = 0; i < array.length; i++)
		 {
			 System.out.println(hello.printInt(array[i],2,true));
			 
		 }
		 
		int[] array2 = new int[10];
		 
		// ArrayList array2 = new ArrayList();
		 
		 for(int i= 0 ;  i<10; i++ )
		 {
			 array2[i] = i;
			 
		 }
		 
		 for(int i = 0; i < 10; i++)
		 {
			 array2[i] = i;
			 System.out.println(i);
		 }
		 
		 
	
	}
		
		
	
	
     private   void printString(String s)
     {
    	 System.out.println(s);
    	 
     }
     
     private String helloWorld()
     {
    	 return "hello World";
     }
     
      private int printInt(int number1, int number2, boolean t)
      {
    	  int i;
    	  if (t == true)
    	  {
    		  i = number1 +  number2;
    	  }
    	  else
    	  {
    		  i = number1 * number1;
    	  }
    	  
    	  if (number1 == 0)
    	  {
    		  i = number2;
    	  }
    	  else if (number2 == 0)
    	  {
    		  i = number1;
    	  }
    	  return i;
    	
      }
      
}
