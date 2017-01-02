
public class CheckerBoardTester {

	public static void main(String[] args) {
		CheckerBoard cb1 = new CheckerBoard();
		System.out.println(cb1);

		//Move Team 1 checker piece from 7,2 to 6,3
		cb1.move(7, 2, 6, 3, 1);
		
		//Try to make same move again...piece shouldn't be there anymore. 
		cb1.move(7, 2, 6, 3, 1);
		
		//Try to move to an out of bounds spot. 
		cb1.move(0, 5, -1, 4, 2);
		
		//Try to move Team 2's piece even though you're Team 1
		cb1.move(0, 5, 1, 4, 1);
		
		//Try to move farther than one space. 
		cb1.move(3, 2, 2, 5, 1);
		
		//Try to move sideways
		cb1.move(6, 3, 7, 3, 1);
		
		//Try to move directly forward
		cb1.move(6, 3, 6, 4, 1);
		
		//Try to move to a space that is occupied.
		cb1.move(6, 3, 5, 4, 1);
		cb1.move(5, 4, 4, 5, 1);
		
		//Print again
		System.out.println(cb1);
	}
}
