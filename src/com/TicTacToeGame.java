/*
 * TicTacToeGame class to play tic tac toe game;
 */
import java.util.*;
public class TicTacToeGame {
	char player,comp;
	/*useCase method creates char array of 10
	 * and initializes it by null
	 */
	public void createBoard() {
		
		char[] board = {'\0', '\0','\0','\0','\0','\0','\0','\0','\0','\0','\0' };
        for (int i=1;i<=10;i++) {
        	System.out.println(board[i]);
        	
        }
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToeGame ttt=new TicTacToeGame();
		ttt.createBoard();
	}

}
