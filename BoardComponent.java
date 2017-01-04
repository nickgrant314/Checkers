import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class BoardComponent extends JComponent {
	
	private static int SPACE_WIDTH = 25;
	private static int SPACE_LENGTH = 25;
	
	private final int BOARD_WIDTH;
	private final int BOARD_LENGTH;
	private CheckerPiece[][] grid;
	
	public BoardComponent(int BOARD_WIDTH, int BOARD_LENGTH, CheckerPiece[][] grid){
		this.BOARD_WIDTH = BOARD_WIDTH;
		this.BOARD_LENGTH = BOARD_LENGTH;
		this.grid = grid;
	}
	
	// Build checker board
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		for(int i = 0; i < BOARD_LENGTH; i++){
			for(int j = 0; j < BOARD_WIDTH; j++){
				Rectangle box = new Rectangle(SPACE_WIDTH*j, SPACE_LENGTH*i, SPACE_WIDTH, SPACE_LENGTH);
				if((i%2 == 0 && j%2 != 0) || (i%2 != 0 && j%2 == 0)){
					g2.setColor(Color.BLACK);
				}
				else{
					g2.setColor(Color.RED);
				}
				g2.fill(box);
				
				//Draw a circle inside space if there's a piece there
				if(grid[j][i] != null){
					Ellipse2D e = new Ellipse2D.Double(SPACE_WIDTH*j, SPACE_LENGTH*i, SPACE_WIDTH, SPACE_LENGTH);
					if(grid[j][i].getTeamName() == 1){
						g2.setColor(Color.GREEN);
					}
					else{
						g2.setColor(Color.WHITE);
					}
					g2.fill(e);
				}
			}
		}
	}
	
}
