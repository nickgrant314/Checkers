import java.util.Arrays;

public class Brainstorm {

	public static void main(String[] args) {
		int BOARD_LENGTH = 8;
		int BOARD_WIDTH = 8;
		
		/*
		 * Build board (8x8)
		 * 
		 * Non-zero means piece is there -- zero means space is empty
		 * Value of 1 = team A
		 * Value of -1 = team B
		 */
		int[][] grid = new int[BOARD_LENGTH][BOARD_WIDTH];
		
		/*
		 * Initialize pieces
		 * 
		 * Team A at top of board
		 * Team B at bottom of board
		 */
		
		//Team A initialization
		for(int i = 0; i < (grid.length-1)/2; i++){
			for(int j = 0; j < grid[0].length; j++){
				if((i%2==0 && j%2!=0)||(i%2!=0 && j%2==0)){
					grid[i][j] = 1;
				}
			}
		}
		
		//Team B initialization
		for(int i = (grid.length/2)+1; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				if((i%2==0 && j%2!=0)||(i%2!=0 && j%2==0)){
					grid[i][j] = -1;
				}
			}
		}
		
		//Print grid
		for(int i = 0; i < grid.length; i++){
			System.out.println(Arrays.toString(grid[i]));
		}
		
		/*
		 * Next things to consider:
		 * 
		 * Movement functions:
		 * MoveForwardLeft()
		 * MoveForwardRight()
		 * 
		 * Checkerpiece Object:
		 * int team;
		 * int boardLoc;
		 * boolean king;
		 * 
		 * Checkerboard Object:
		 * int[][] grid;
		 * Checkerpiece[] teamA;
		 * Checkerpiece[] teamB;
		 */
		
	}
	
}
