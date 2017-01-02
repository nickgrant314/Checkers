
/*
 * Nick Grant
 * January 2nd, 2017
 * 
 * BoardLoc class
 * 
 */

public class BoardLoc {
	
	private int row;
	private int col;
	
	//Board location can not be initialized without both row and col specified
	BoardLoc(int row, int col){
		this.row = row;
		this.col = col;
	}
	
	int getX(){
		return this.col;
	}
	
	int getY(){
		return this.row;
	}
	
	void shiftX(int amt){
		this.col += amt;
	}
	
	void shiftY(int amt){
		this.row += amt;
	}
	
	/*
	 * Used to compare two Board locations and determine whether they are equivalent
	 * 
	 * return value of 'true' signifies equivalency
	 */
	public boolean equals(Object other){
		
		//Base cases
		if(other == null){ return false; }
		if(!(other instanceof BoardLoc)){ return false; }
		
		
		BoardLoc otherLoc = (BoardLoc) other;
		
		return ( (this.row == otherLoc.row) && (this.col == otherLoc.col) );
	}
	
	// return a String representation of Board location
	public String toString() {
		return "Row: " + this.row + " Col: " + this.col;
	}
	
}
