/*
 * Nick Grant
 * January 2nd, 2017
 * 
 * CheckerPiece class
 * 
 */
public class CheckerPiece {
	
	private BoardLoc bLoc;
	private int team;	//Should use this value to restrict movement of pieces (access to modifiers below)
	boolean king;
	
	// We can assume when initialized, a piece is not yet a king
	CheckerPiece(BoardLoc bLoc, int team){
		this.bLoc = bLoc;
		this.team = team;
		this.king = false;
	}
	
	/*
	 * Modifiers
	 * 
	 * The following 4 functions are available to move a checker piece
	 * (not accounting for King movement yet)
	 */
	void moveDownLeft(){
		this.bLoc.shiftX(-1);
		this.bLoc.shiftY(1);
	}
	
	void moveDownRight(){
		this.bLoc.shiftX(1);
		this.bLoc.shiftY(1);
	}
	
	void moveUpLeft(){
		this.bLoc.shiftX(-1);
		this.bLoc.shiftY(-1);
	}
	
	void moveUpRight(){
		this.bLoc.shiftX(1);
		this.bLoc.shiftY(-1);
	}
	
	
	/*
	 * Accessors
	 * 
	 * Get any info about the Checker Piece we need
	 */
	int getTeamName(){
		return team;
	}
	
	
	// return a String representation of this checker piece
	public String toString() {
		
		return "Team " + this.team + ": LOCATION = " + bLoc;
	}
	
}
