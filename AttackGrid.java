import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
Represents the player's own grid
*/
public class AttackGrid extends BattleGrid {
	
	int grid[][] = new int [10][10];
    public AttackGrid(String name) {
        super();
        
    }

    @Override
    protected JPanel getCell()
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setBorder(BorderFactory.createLineBorder(Color.red, 5));
        panel.setPreferredSize(new Dimension(40, 40)); // for demo purposes only
        panel.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		panel.setBackground(Color.green);
        	}
        });
        
        
        
        return panel;
    }
    
    
}