import java.awt.BorderLayout;

import javax.swing.JFrame;

public class BoardFrame extends JFrame {
	
	private static int FRAME_WIDTH = 500;
	private static int FRAME_HEIGHT = 500;
	
	private final int BOARD_WIDTH;
	private final int BOARD_LENGTH;
	private CheckerPiece[][] grid;
	
	private BoardComponent boardComponent;
	
	public BoardFrame(int BOARD_WIDTH, int BOARD_LENGTH, CheckerPiece[][] grid){
		this.BOARD_WIDTH = BOARD_WIDTH;
		this.BOARD_LENGTH = BOARD_LENGTH;
		this.grid = grid;
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		setTitle("Checker Board");
		
		boardComponent = new BoardComponent(BOARD_WIDTH, BOARD_LENGTH, grid);
		add(boardComponent, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
}
