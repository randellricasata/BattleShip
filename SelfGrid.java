import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
Represents the player's own grid
*/
public class SelfGrid extends BattleGrid {
	int selfGrid[][] = new int[10][10];
    public SelfGrid(String name, PlayerData p) {
        super();
        
    }

    @Override
    protected JPanel getCell(int row, int column)
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
        panel.setPreferredSize(new Dimension(40, 40));
		    panel.addMouseListener(new MouseAdapter() {
		        	public void mouseClicked(MouseEvent e) 
		        	{
		        		if (selfGrid[row][column] == 0) {
			        		if (SwingUtilities.isRightMouseButton(e) && (selfGrid[row][column+1] == 0) && (selfGrid[row][column+2] == 0)) {
			        			super.mouseClicked(e);
			        			panel.setBackground(Color.gray);
			        			panel.setSize(new Dimension(120, 40));
			        			panel.setEnabled(false);
				        		panel.removeMouseListener(this);
				        		System.out.print(String.valueOf(row) + " " + String.valueOf(column) + "\n");
				        		
					        	selfGrid[row][column] = 1;
					        	selfGrid[row][column + 1] = 1;
					        	selfGrid[row][column + 2] = 1;
			        		}
			        		else if(SwingUtilities.isLeftMouseButton(e) && (selfGrid[row+1][column] == 0) && (selfGrid[row+2][column] == 0)) {
			        			super.mouseClicked(e);
			        			panel.setBackground(Color.gray);
			        			panel.setSize(new Dimension(40, 120));
			        			panel.setEnabled(false);
				        		panel.removeMouseListener(this);
				        		System.out.print(String.valueOf(row) + " " + String.valueOf(column) + "\n");
				        		
				        		selfGrid[row][column] = 1;
				        		selfGrid[row + 1][column] = 1;
				        		selfGrid[row + 2][column] = 1;
			        		}
		        		}
		        		else {
		        			return;
		        		}
		        	}
		        });
        return panel;
    }
}