/*
 * TicTacToeGame class to play Tic Tac Toe game;
 */
import java.util.*;
public class TicTacToeGame {
	char player,comp;
	/*useCase method creates char array of 10
	 * and initializes it by null
	 */
	char[] board = new char[10];
	public void createBoard() {
		
		char[] board = {'\0','\0','\0','\0','\0','\0','\0','\0','\0','\0'};
        for (int i = 1;i <= 9;i++) {
        	System.out.println(board[i]);
        	this.board[i]=board[i];
        	
        }
        }
        //UC2
        public void letterChoice() {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Choose 1. X \n 2. O");
        	if(sc.nextInt() == 1) {
        		this.player ='X';
        		this.comp ='O';
        	}
        	else {
        		this.player ='O';
        		this.comp ='X';
        	}
        	System.out.println("your choice "+player+" computer choice "+comp);
        	
        }
        //UC3
        public void showBoard() {
        	System.out.println(board[1] + "|" + board[2] + "|" + board[3]);
        	System.out.println("-----");
        	System.out.println(board[4] + "|" + board[5] + "|"+ board[6]);
        	System.out.println("-----");
        	System.out.println(board[7] + "|" + board[8] + "|" + board[9]);
        	
        }
        //UC4
        public void playerMoves() {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Your move");
        	int i = sc.nextInt();
        	if(i >= 1 && i <= 9) {
        		if (board[i] == '\0') 
        		board[i] = player;
        	else 
        		System.out.println("position occupied");
        	this.showBoard();
        	}
        	else
        		System.out.println("Invalid position");
        }
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TicTacToeGame tictactoe=new TicTacToeGame();
		
		tictactoe.createBoard();
		tictactoe.letterChoice();
		tictactoe.showBoard();
		tictactoe.playerMoves();
		
	}

}

