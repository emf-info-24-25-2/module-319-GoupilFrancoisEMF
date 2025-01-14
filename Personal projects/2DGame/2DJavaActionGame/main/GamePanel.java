package main

import javax.swing.JFrame;

public class GamePanel {
    
    public static void main(String[] args) throws Exception {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Game");
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
