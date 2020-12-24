package CGL;

public class Board {
	public boolean[][] board;
	
	//creates a Conways game board with given values
		//return the present generation board and next generation board
	public boolean[][] createBoard(int n) {		
		if(n<0) {
			return null;
		}
		else {
			boolean[][] board = new boolean[n][n];
			for(int i=0;i<board.length;i++) {
				for(int j=0;j<board[i].length;j++) {
					board[i][j]=false;
					}
				}
			return(printBoard(board));
			}
		
		}
	public boolean[][] printBoard(boolean[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				board[1][3]=true;
				board[1][4]=true;
				board[2][4]=true;
				board[5][3]=true;
				board[5][4]=true;
				board[6][2]=true;
				board[6][3]=true;
				board[7][5]=true;
				board[8][4]=true;
			}
		}
		return board;
	}
	
}
