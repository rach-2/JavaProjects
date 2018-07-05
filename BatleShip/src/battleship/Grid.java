package battleship;

public class Grid 
{
      private int [][] gameBoard;
      
      private  void setUpGrid() 
      {
    	   this.gameBoard = new int[3][3];
    	   gameBoard[0][0] = 0;
    	   gameBoard[0][1] = 0;
    	   gameBoard[0][2] = 0;
    	   gameBoard[1][0] = 0;
    	   gameBoard[1][1]= 0;
    	   gameBoard[1][2]= 0;
    	   gameBoard[2][0] = 0;
    	   gameBoard[2][1] = 0;
    	   gameBoard[2][2] = 0;
    	 
      }
      
      public void printGrind()
      {
    	  this.setUpGrid();
    	  for(int i=0; i<gameBoard.length; i++)
    	  {
    		  
    		  for(int j=0; j< gameBoard[i].length; j++)
    		  {
    			  System.out.print(gameBoard[i][j]+"\t");
    		  }
    		  System.out.println();
    	  }
    	  
      }
      
     
}