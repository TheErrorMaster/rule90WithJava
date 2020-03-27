package project1;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class grid extends JFrame{
	private final int ROWS = 100;
	private final int COLS = 100;
	private final int GAP = 2;
	private JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
	private JPanel[][] panel = new JPanel[ROWS][COLS];
	private JLabel[][] label = new JLabel[ROWS][COLS];
	public grid() {
		super("Checker Board");
		add(pane);
		for(int x = 0; x < ROWS; ++x) {
			for(int y = 0; y < COLS; ++y) {
			panel[x][y] = new JPanel();
			pane.add(panel[x][y]);
			panel[x][y].setBackground(Color.WHITE);
			}
		}
		panel[0][50].setBackground(Color.BLACK);
		for(int r = 1; r < (ROWS-1); ++r) {
			for(int c = 1; c < (COLS-1); ++c) {
				if(panel[r-1][c-1].getBackground() == Color.BLACK && panel[r-1][c].getBackground() == Color.BLACK && panel[r-1][c+1].getBackground() == Color.WHITE ) {
					panel[r][c].setBackground(Color.BLACK);
				}
				if(panel[r-1][c-1].getBackground() == Color.BLACK && panel[r-1][c].getBackground() == Color.WHITE && panel[r-1][c+1].getBackground() == Color.WHITE ) {
					panel[r][c].setBackground(Color.BLACK);
				}
				if(panel[r-1][c-1].getBackground() == Color.WHITE && panel[r-1][c].getBackground() == Color.BLACK && panel[r-1][c+1].getBackground() == Color.BLACK ) {
					panel[r][c].setBackground(Color.BLACK);
				}
				if(panel[r-1][c-1].getBackground() == Color.WHITE && panel[r-1][c].getBackground() == Color.WHITE && panel[r-1][c+1].getBackground() == Color.BLACK ) {
					panel[r][c].setBackground(Color.BLACK);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grid frame = new grid();
		frame.setSize(1000,1000);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}