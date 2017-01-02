
public class CheckerPieceTester {

	public static void main(String[] args) {
		//Team 1 piece
		CheckerPiece cp1 = new CheckerPiece(new BoardLoc(1,1), 1);
		
		//Team 2 piece
		CheckerPiece cp2 = new CheckerPiece(new BoardLoc(4,4), 2);
		
		System.out.println(cp1);
		System.out.println(cp2);
		
		//Test shift functions
		cp1.moveDownLeft();
		System.out.println(cp1);
		cp1.moveUpRight();
		System.out.println(cp1);
		cp1.moveUpLeft();
		System.out.println(cp1);
		cp1.moveDownRight();
		System.out.println(cp1);
		
	}

}
