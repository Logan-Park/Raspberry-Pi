import java.util.*;

public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Title.title();
		int game_status = 1;
		int choice = 9;

		while(game_status == 1) {
			Prompt.prompt();
			choice = input.nextInt(); 

			if(choice == 9) {
				game_status = 0;
			}
		}
	}
}
