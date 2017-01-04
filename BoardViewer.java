
public class BoardViewer {

	public static void main(String[] args) {
		
		CheckerBoard cb1 = new CheckerBoard();
		BoardFrame bFrame = new BoardFrame(8, 8, cb1.getGrid());
		
		//Move Team 1 checker piece from 7,2 to 6,3
		cb1.move(7, 2, 6, 3, 1);
		BoardFrame bFrame2 = new BoardFrame(8, 8, cb1.getGrid());
		
		//Move Team 1 checker piece from 6,3 to 5,4
		cb1.move(6, 3, 5, 4, 1);
		BoardFrame bFrame3 = new BoardFrame(8, 8, cb1.getGrid());
		
		//Move Team 1 checker piece from 6,3 to 5,4
		cb1.move(5, 4, 4, 5, 1);
		BoardFrame bFrame4 = new BoardFrame(8, 8, cb1.getGrid());
		
	}

}
