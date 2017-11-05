import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class AttackGrid extends BattleGrid {
	PlayerData player;
	PlayerData opponent;
	BattleShip game;
	PlayerScreen screen;
	
    public AttackGrid(PlayerData p, PlayerData o, PlayerScreen a) {
        super(p);
        this.player = p;
        this.opponent = o;
        screen = a;
    }

    @Override
    protected JPanel getCell(int row, int column)
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setBorder(BorderFactory.createLineBorder(Color.red, 1));
        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only
        
   
        
        panel.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		if (player.getAGrid()[row][column] == 0) {
	        		if (opponent.getSGrid()[row][column] == 1) {
	        			panel.setBackground(Color.green);
	        		}
	        		else {
	        			for (int i = 0; i < 10; i++) {
	        				for (int j = 0; j < 10 ; j++) {
	        					System.out.print(opponent.getSGrid()[i][j]);
	        				}
	        			}
	        			panel.setBackground(Color.red);
	        			player.setAGrid(row, column, 1);
	        		}
        		}
        	}
        });
        
        return panel;
    }
    
    
}