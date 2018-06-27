import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
//		Seat seat1  = new Seat(30,50);
//		Seat seat2  = new Seat(130,75);
//		Seat seat3  = new Seat(90 ,60);
//		Seat seat4  = new Seat(150,85);
//		Seat seat5 = new Seat(120,70);
//		Seat seat6 = new Seat(200,200);
//		Seat seat7 = new Seat(100,100);
//		
//		ArrayList<Seat> seatList = new ArrayList<Seat>();
//		seatList.add(seat1);
//		seatList.add(seat2);
//		seatList.add(seat3);
//		seatList.add(seat4);
//		seatList.add(seat5);
//		seatList.add(seat6);
//		seatList.add(seat7);
		
		
	int[][] seatArray = new int[7][2];
	seatArray[0][0] = 30;
	seatArray[0][1] = 50;
	seatArray[1][0] = 130;
	seatArray[2][0] = 90;
	seatArray[2][1] = 60;
	seatArray[3][0] = 120;
	seatArray[3][1] = 70;
	seatArray[4][0] = 200;
	
	Goldilocks goldilocks = new Goldilocks(100,80);
		
		for(int i = 0; i<seatArray.length; i++)
		{
			for (int j = 0; j<seatArray[i].length;j++)
			{
				
			}
		}
		
	}

}
