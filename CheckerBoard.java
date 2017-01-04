import java.util.ArrayList;
import java.util.Arrays;

/*
 * Nick Grant
 * January 2nd, 2017
 * 
 * CheckerBoard class
 * 
 * Checkerboard will be represented as a 2D array of CheckerPieces. 
 * If a slot in the array is null, that symbolizes a blank space on the board. 
 * 
 */

public class CheckerBoard {

	private static int BOARD_LENGTH = 8;
	private static int BOARD_WIDTH = 8;
	private CheckerPiece[][] grid;
	
	//Initialize board with standard checkers formation
	CheckerBoard(){
		grid = new CheckerPiece[BOARD_LENGTH][BOARD_WIDTH];
	
		//Team 1 initialization
		for(int i = 0; i < (grid.length-1)/2; i++){
			for(int j = 0; j < grid[0].length; j++){
				if((i%2==0 && j%2!=0)||(i%2!=0 && j%2==0)){
					grid[i][j] = new CheckerPiece(new BoardLoc(i,j), 1);
				}
			}
		}
				
		//Team 2 initialization
		for(int i = (grid.length/2)+1; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				if((i%2==0 && j%2!=0)||(i%2!=0 && j%2==0)){
					grid[i][j] = new CheckerPiece(new BoardLoc(i,j), 2);
				}
			}
		}
		
	}
	
	//For display purposes
	CheckerPiece[][] getGrid(){
		return grid;
	}
	
	//One piece attempts to move elsewhere 
	int move(int xLoc1, int yLoc1, int xLoc2, int yLoc2, int teamName){
		if(yLoc1 >= grid.length || yLoc2 >= grid.length || xLoc1 >= grid[0].length || xLoc2 >= grid[0].length
				|| yLoc1 < 0 || yLoc2 < 0 || xLoc1 < 0 || xLoc2 < 0) {printErrorMessages(1);return 1;}
		if((Math.abs(xLoc2-xLoc1) != 1 || Math.abs(yLoc2-yLoc1) != 1) && !grid[yLoc1][xLoc1].king()) {printErrorMessages(5);return 5;}
		if(grid[yLoc1][xLoc1] == null) {printErrorMessages(2);return 2;}
		if(spaceOccupied(xLoc2,yLoc2)) {printErrorMessages(3);return 3;}
		if(grid[yLoc1][xLoc1].getTeamName() != teamName) {printErrorMessages(4);return 4;}
		
		
		//If deemed a valid move, execute it
		grid[yLoc2][xLoc2] = new CheckerPiece(new BoardLoc(yLoc2,xLoc2), teamName);
		grid[yLoc1][xLoc1] = null;
		return 0;
	}
	
	//One piece attempts to hop another piece
	boolean hop(int xLoc1, int yLoc1, int xLoc2, int yLoc2){
		return false;
	}
	
	//Check if board space is occupied
	boolean spaceOccupied(int x, int y){
		return (grid[y][x] != null);
	}
	
	
	// return a String representation of the current board
	public String toString() {
		String output = "";
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				if(grid[i][j] != null){
					output += grid[i][j];
					output += "\n";
				}
			}
		}
		return output;
	}
	
	
	/*
	 * Purely here to organize all of the print statements in 1 place...code looks nicer this way
	 */
	void printErrorMessages(int errorCode){
		if(errorCode == 1){System.out.println("One or more of the spaces you provided aren't on the board. Please try again.");}
		if(errorCode == 2){System.out.println("There isn't a piece to move at the space you specified. Please try again.");}
		if(errorCode == 3){System.out.println("That space is occupied. Maybe try hopping that space?");}
		if(errorCode == 4){System.out.println("That isn't your piece, so you can't move it. Please try again.");}
		if(errorCode == 5){System.out.println("The move you attempted to make is invalid with that piece.");}
		
		printValidActions();
	}
	
	//Help list for the user
	void printValidActions(){
		System.out.println("The following actions are valid (for non-King players):");
		System.out.println("'Move' Command: Specify a location one space diagonal and forward from your current position.");
		System.out.println("'Hop' Command: Specify the location of the piece you want to hop. Piece must be diagonally");
		System.out.println("in front of you and have an empty slot behind it diagonally in the same direction.");
	}
}
