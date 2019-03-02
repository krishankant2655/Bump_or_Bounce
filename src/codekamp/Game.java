package Bump_or_Bounce;

import Bump_or_Bounce.Entity.Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Game {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 450;

    public static int score = 0;

    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel g = new GamePanel();
        f.add(g);
        f.pack();
        f.setVisible(true);

        Player p = new Player(10, 20) {

            @Override
            public void jump() {
                System.out.println("overriddent jump function");
            }
        };

        KeyListener l = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }
            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

        JButton b1 = new JButton();
        JButton b2 = new JButton();

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        b2.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
         p.jump();


    }
}