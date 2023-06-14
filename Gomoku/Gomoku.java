import java.util.*;

public class Gomoku {
	String playerOne;
	String playerTwo;

	Gomoku instance = null;
	
	int gameState = 1; //1 == Game On, 0 == No Game
	GomokuBoard board;

	private Gomoku(String playerOne, String playerTwo) {
		if(instance == null){
			this.playerOne = playerOne;
			this.playerTwo = playerTwo;
			this.board = new GomokuBoard();
		}
	
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String temp1 = "";
		String temp2 = "";
		System.out.println("Welcome to Logi's Gomoku Game!!!\n\n");
		
		System.out.println("Enter Player One's Name:");
		temp1 = input.nextLine();

		System.out.println("\n\nEnter Player Two's Name:");
		temp2 = input.nextLine();

		Gomoku game = new Gomoku(temp1, temp2);

		System.out.println("\n\nWelcome " + game.playerOne + " and " + game.playerTwo);

		game.board.printBoard();
	}
}

