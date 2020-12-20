package com.company;

import java.awt.*;
import java.awt.event.*;  //отслеживать нажатия на кнопки
import javax.swing.*; //для формочек


public class SimpleGUI extends JFrame {
    int countAC = 0, countReal = 0;
    private JButton AC_Milan = new JButton("<html><h3><font color= \"red\">AC Milan"); //кнопка и ее название
    private JButton Real_Madrid = new JButton("<html><h3><font color= \"yellow\">Real Madrid"); //кнопка и ее название
    private JLabel res = new JLabel("Result: " + countAC + " X " + countReal); //надпись для формочки
    private JLabel scorer = new JLabel("Last Scorer:  N/A"); //надпись для формочки
    private Label win = new Label("Winner: DRAW");

    public SimpleGUI() {
        super("Simple GUI"); //конструктор класса JFrame
        this.setBounds( 0,0,500, 500); // установили размер
        this.setBackground(Color.magenta);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //при закрывании окна все закрывается
        AC_Milan.setBounds(20, 100, 180, 50);
        AC_Milan.setBackground(Color.darkGray);
        Real_Madrid.setBounds(285, 100, 180, 50);
        Real_Madrid.setBackground(Color.darkGray);
        //Real_Madrid.setIcon( new ImageIcon("C:\\Users\\Лиза\\Desktop\\real.png"));
        res.setBounds(200, 60, 100, 50);
        scorer.setBounds(200, 20, 200, 50);
        win.setBounds(200, 150, 100, 50);
        add(AC_Milan);
        AC_Milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countAC += 1;
                scorer.setText("Last scorer: AC Milan");
                res.setText("Result: " + countAC + " X " + countReal);
                if (countReal == countAC)
                    win.setText("Winner: DRAW");
                else win.setText(countReal > countAC ? "Winner: Real Madrid" : "Winner: AC Milan");
            }
        });

        add(Real_Madrid);
        Real_Madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countReal+=1;
                scorer.setText("Last scorer: Real Madrid");
                res.setText("Result: "+countAC+"X"+countReal);
                if (countReal==countAC)
                    win.setText("WINNER: DRAW");
                else win.setText(countReal>countAC?"WINNER: Real Madrid":"WINNER: AC Milan");
            }
        });
        add(res);
        add(scorer);
        add(win);
        setVisible(true);
    }
}