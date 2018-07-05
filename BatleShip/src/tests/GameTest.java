package tests;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import battleship.Game;
import battleship.Ship;

public class GameTest 
{

	Game game = null;
	Ship shipOne = null;
	Ship shipTwo = null;

	@Before
    public void setUp() 
	{
		  game = new Game();
		  shipOne = new BattleShip();
		  shipTwo = new BattleShip();
		  game.addShip(shipOne);
				  
	}

	@Test
	public void testAddShip() 
	{
		shipThere = new BattleShip()
	     game.addShips(shipOne);
	     assertEquals(3, game.size(),);
	     
	     
	}

}
