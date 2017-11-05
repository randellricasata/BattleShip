import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.List;

/**
Represents the player's own grid
*/
public class SelfGrid extends BattleGrid {
	PlayerData player;
	BattleShip thisGame;
	PlayerScreen screen;
	JPanel xPanel = null;
	
    public SelfGrid(PlayerData p, PlayerScreen a) {
        super(p);
        player = p;
        screen = a;
     
    }

    @Override
    protected JPanel getCell(int row, int column)
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
        panel.setPreferredSize(new Dimension(20, 20));
        
	    panel.addMouseListener(new MouseAdapter() {
	    	
		        	public void mouseClicked(MouseEvent e) 
		        	{
		        		if (player.getSGrid()[row][column] == 0) {
			        		if (SwingUtilities.isRightMouseButton(e) && (player.getSGrid()[row][column+1] == 0) && (player.getSGrid()[row][column+2] == 0)) {
			        			super.mouseClicked(e);
			        			panel.setBackground(Color.gray);
			        			panel.setEnabled(false);
				        		panel.removeMouseListener(this);
				        		player.setSGrid(row, column, 1);
				        		player.setSGrid(row, column+1, 1);
				        		player.setSGrid(row, column+2, 1);
				        		player.setNumShips(player.getNumShips()+1);
				        		screen.updateOwnShips(player);
			        		}
			        		else if(SwingUtilities.isLeftMouseButton(e) && (player.getSGrid()[row+1][column] == 0) && (player.getSGrid()[row+2][column] == 0)) {
			        			super.mouseClicked(e);
			        			panel.setBackground(Color.gray);
			        			panel.setEnabled(false);
				        		panel.removeMouseListener(this);
				        		player.setSGrid(row, column, 1);
				        		player.setSGrid(row+1, column, 1);
				        		player.setSGrid(row+2, column, 1);
				        		player.setNumShips(player.getNumShips()+1);
				        		screen.updateOwnShips(player);
			        		}
		        		}

		        	}
		        	
		        });
	    
        return panel;
        
    }
}