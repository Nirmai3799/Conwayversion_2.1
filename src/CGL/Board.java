package CGL;

public class Board {
	public boolean[][] board;
	
	//creates a Conways game board with given values
		//return the present generation board and next generation board
	public boolean[][] createBoard(int n,int l[][]) {
		
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
			return(printBoard(board,l));
			}
		
		}
	public boolean[][] printBoard(boolean[][] board,int s[][]) {
		for(int i=0;i<s.length;i++) {
			int r=s[i][0];
			int c=s[i][1];
			board[r][c]=true;
			
		}
		/**for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
			
		}**/
		return board;
	}
	/**public static void main(String[] args) {
		 Board p=new Board();
		 ConwayGameOfLife cgl=new ConwayGameOfLife();
		 int s[][]= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		 cgl.generateNextGeneration(p.createBoard(10,s),3);
	   }**/
	
}
