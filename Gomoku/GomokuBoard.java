public class GomokuBoard {
	String[][] board = new String[18][18];

	public GomokuBoard() {
		for(int i = 0; i < 18; i++) {
			for(int j = 0; j < 18; j++) {
				board[i][j] = " ";
			}
		}
	}
	public void printBoard() {
		System.out.print("    ");
		for(int i = 0; i < 18; i++) {
			if(i < 9)
				System.out.print(i + "  ");
			else
				System.out.print(i + " ");
		}
		System.out.print("\n_________________________________________________________");
		for(int i = 0; i < 18; i++) {
			System.out.println();
			if(i < 10) {
				System.out.print(i + ": ");
			}
			else {
				System.out.print(i + ":");
			}
			for(int j = 0; j < 18; j++) {		
				System.out.print("|" + this.board[i][j] + "|");
			}
		}
		System.out.println("\n_________________________________________________________");
	}	
}
