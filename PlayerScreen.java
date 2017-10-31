import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;


public class PlayerScreen extends JFrame {
    public PlayerScreen(String name, boolean show) {
        super(name);
        this.setLayout(new BorderLayout());
        
        PlayerData player = new PlayerData(name);
        Container p1 = new Container();
        
        JLabel ownShips = new JLabel("Number of Own Ships:");
        JLabel dOwnShips = new JLabel(String.valueOf(player.getNumShips()));
        
        JLabel selfShipsSunk = new JLabel("Number of Self Ships Sunk:");
        JLabel dSelfShipsSunk = new JLabel(String.valueOf(player.getSelfSinkShips()));
        
        JLabel enemyShipsSunk = new JLabel("Number of Enemy Ships Sunk: ");
        JLabel dEnemyShipsSunk = new JLabel(String.valueOf(player.getNumEnemySinkShips()));
        
        JPanel p = new JPanel();
        
        p.add(ownShips);
        p.add(dOwnShips);
        p.add(selfShipsSunk);
        p.add(dSelfShipsSunk);
        p.add(enemyShipsSunk);
        p.add(dEnemyShipsSunk);
        
        this.add(new SelfGrid(name), BorderLayout.EAST);
        this.add(new AttackGrid(name), BorderLayout.WEST);
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
}