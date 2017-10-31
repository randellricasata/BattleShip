import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
Represents the player's own grid
*/
public class SelfGrid extends BattleGrid {
    public SelfGrid(String name) {
        super();
        
    }

    @Override
    protected JPanel getCell()
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
        panel.setPreferredSize(new Dimension(40, 40));
		for (int i = 0; i < 3; i++) {
		    panel.addMouseListener(new MouseAdapter() {
		        	public void mouseClicked(final MouseEvent e) 
		        	{
			        		if (SwingUtilities.isRightMouseButton(e)) {
			        			super.mouseClicked(e);
			        			panel.setBackground(Color.gray);
			        			panel.setSize(new Dimension(120, 40));
			        			panel.setEnabled(false);
				        		panel.removeMouseListener(this);
			        		}
			        		else if(SwingUtilities.isLeftMouseButton(e)) {
			        			super.mouseClicked(e);
			        			panel.setBackground(Color.gray);
			        			panel.setSize(new Dimension(40, 120));
			        			panel.setEnabled(false);
				        		panel.removeMouseListener(this);
			        		}
		        	}
		        });
		}
        return panel;
    }
}