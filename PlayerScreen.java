import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;


public class PlayerScreen extends JFrame {

    JLabel ownShips = new JLabel("Number of Own Ships:");
    JLabel selfShipsSunk = new JLabel("Number of Self Ships Sunk:");
    JLabel enemyShipsSunk = new JLabel("Number of Enemy Ships Sunk: ");
	BorderLayout layout = new BorderLayout();
	PlayerData player;
    
    public PlayerScreen(String name, boolean show, PlayerData p1, PlayerData opponent) {
        super(name);
        this.setLayout(layout);
        player = p1;
        
        
        ownShips.setText(ownShips.getText() + String.valueOf(player.getNumShips()));
        selfShipsSunk.setText(selfShipsSunk.getText() + String.valueOf(player.getSelfSinkShips()));
        enemyShipsSunk.setText(enemyShipsSunk.getText() + String.valueOf(player.getNumEnemySinkShips()));
        
        JPanel p = new JPanel();
        
        p.add(ownShips);
        p.add(selfShipsSunk);
        p.add(enemyShipsSunk);
        
        this.add(new SelfGrid(player, this), BorderLayout.EAST);
        this.add(new AttackGrid(player, opponent, this), BorderLayout.WEST);
        this.add(new JLabel(name), BorderLayout.NORTH);
        this.add(p, BorderLayout.SOUTH);
        
        JButton next = new JButton("next");
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hideScreen();
            }
        });
        this.add(next, BorderLayout.CENTER);
        this.pack();
        this.setVisible(show);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void hideScreen() {
        this.setVisible(false);
    }
    
    public void updateOwnShips(PlayerData player) {
    	this.ownShips.setText("Number of Own Ships:" + String.valueOf(player.getNumShips()));
    }
    
}