package RockPaperScissors;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissors {
	public static void main(String[] args) {
		RockPaperScissors c = new RockPaperScissors();
		c.RockPaperScissors(0, 0);
	}
	
	
	Scanner input = new Scanner(System.in);

	
	public int RockPaperScissors(int userScore, int compScore) {
	System.out.println("Please pick your move");
	String userMove = input.next();
	
	
	ArrayList<String> moveList = new ArrayList<String>();	
	moveList.add("rock");
	moveList.add("paper");
	moveList.add("scissors");

	
	double index = Math.random() * 3;
	String compMove = moveList.get((int)(Math.random()*3));
	System.out.println("Computer picks " + compMove );
	//user move = rock
	if(userMove.equals("rock") && compMove == "paper") {
		System.out.println("Paper covers Rock. Computer wins!");
		compScore = compScore +1;
		System.out.println("New Computer Score is: " + compScore);
		
	} else if(userMove.equals("rock") && compMove == "scissors") {
		System.out.println("Rock Smashes Scissors. User wins!");
		userScore = userScore + 1;
		System.out.println("New user score is: " + userScore); 
		
	} else if(userMove.equals("rock") && compMove == "rock") {
		System.out.println("Draw");
		
	//user move = paper	
	}if(userMove.equals("paper") && compMove == "paper") {
		System.out.println("draw");
		
	} else if(userMove.equals("paper") && compMove == "rock") {
		System.out.println("Paper covers Rock. User wins!");
		userScore = userScore +1;
		System.out.println("New user score is: " + userScore); 
	} else if(userMove.equals("paper") && compMove == "scissors") {
		System.out.println("Scissors cut Paper. Computer wins!");
		compScore = compScore +1; 
		System.out.println("New computer score: " + compScore);
		
		//user move = scissors
	} if(userMove.equals("scissors") && compMove == "rock") {
		System.out.println("Rock Smashes Scissors. Computer wins!");
		compScore = compScore +1;
		System.out.println("New computer score: " + compScore);
	} else if(userMove.equals("scissors") && compMove == "scissors") {
		System.out.println("Draw");
	} else if(userMove.equals("scissors") && compMove == "paper") {
		System.out.println("Scissors cut Paper. User wins!");
		userScore = userScore +1;
		System.out.println("New user score: " + userScore);
	} if(userScore == 5 || compScore == 5) {
	
		return compScore;
	}
   RockPaperScissors(userScore, compScore);}
	

	}
}


