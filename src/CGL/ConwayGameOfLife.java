package CGL;
public class ConwayGameOfLife extends Board{
	
	public int countLiveCells(boolean[][] current,int p,int q){
        int n = current.length;
        int lives=0;
        for(int i=p-1;i<=p+1;i++){
            for(int j=q-1;j<=q+1;j++){
                if(i!=p || j!=q){
                    if(i>=0 && i<n && j>=0 && j<n && current[i][j]){
                        lives+=1;
                        }
                    }
                }
            }
        return lives;
        }
	public String generateNextGeneration(boolean current[][],int x) {
        int n = current.length;
        boolean[][] newBoard = new boolean[n][n];
        if(x<=0) {
        	return "Iteration can't be performed.";
        }
        for(int a=0;a<x;a++) {
        	for(int i=0;i<n;i++){
        		for(int j=0;j<n;j++){
        			int ilives = countLiveCells(current,i,j);
        			if(current[i][j]){
        				if(ilives<2){
        					newBoard[i][j]=false;
        					}
        				else if(ilives<=3){
        					newBoard[i][j]=true;
        					}
        				else if(ilives>3){
        					newBoard[i][j]=false;
        					}
        				}
        			else{
        				if(ilives==3){
        					newBoard[i][j] = true;
        					}
        				}
        			}
        		}
        	current=newBoard;
        	}
        return displayBoard(newBoard);
    }
   public String displayBoard(boolean[][] board) {
		StringBuffer sb = new StringBuffer();
        for(int i=0;i<board.length;i++)
        {
        	for(int j=0;j<board[i].length;j++)
        	{
        		if(board[i][j])
        			sb.append("*");
        		else
        			sb.append(".");
        		}
        	sb.append("\n");
        	}
        return sb.toString();
        }
   }