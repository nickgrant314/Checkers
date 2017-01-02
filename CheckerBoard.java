import java.util.ArrayList;

/*
 * Nick Grant
 * January 2nd, 2017
 * 
 * CheckerBoard class
 */

public class CheckerBoard {

	private static int BOARD_LENGTH = 8;
	private static int BOARD_WIDTH = 8;
	boolean[][] grid;
	ArrayList<CheckerPiece> teamA;
	ArrayList<CheckerPiece> teamB;
	
	//Initialize board with standard checkers formation
	CheckerBoard(){
		grid = new boolean[BOARD_LENGTH][BOARD_WIDTH];
		teamA = new ArrayList<CheckerPiece>();
		teamB = new ArrayList<CheckerPiece>();
		
		//Team A initialization
		for(int i = 0; i < (grid.length-1)/2; i++){
			for(int j = 0; j < grid[0].length; j++){
				if((i%2==0 && j%2!=0)||(i%2!=0 && j%2==0)){
					grid[i][j] = true;
					teamA.add(new CheckerPiece(new BoardLoc(j,i), 1));
				}
			}
		}
				
		//Team B initialization
		for(int i = (grid.length/2)+1; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				if((i%2==0 && j%2!=0)||(i%2!=0 && j%2==0)){
					grid[i][j] = true;
					teamB.add(new CheckerPiece(new BoardLoc(j,i), 2));
				}
			}
		}
		
	}
	
	// return a String representation of the current board
	public String toString() {
		return "hey";
	}
}
