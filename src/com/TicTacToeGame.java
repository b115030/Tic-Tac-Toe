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
        //UC2
        public void letterChoice(int choice) {
        	
        	if(choice==1) {
        		this.player='X';
        		this.comp='O';
        	}
        	else {
        		this.player='O';
        		this.comp='X';
        	}
        	System.out.println("your choice"+player+" computer choice "+comp);
        	
        }
        
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TicTacToeGame ttt=new TicTacToeGame();
		System.out.println("Choose 1. X \n 2. O");
		ttt.letterChoice(sc.nextInt());
		ttt.createBoard();
	}

}
