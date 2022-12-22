package ex1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class JFrameTemplate extends JFrame {
    Random random;
    public JFrameTemplate(){
        setTitle("praktika12");
        random = new Random();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(10, 10, 750, 750);
        //setSize(600, 400);
        setLocationRelativeTo(null);

        Color[] colors = new Color[6];
        colors[0] = Color.BLACK;
        colors[1] = Color.RED;
        colors[2] = Color.BLUE;
        colors[3] = Color.GREEN;
        colors[4] = Color.YELLOW;
        colors[5] = Color.CYAN;

        for (int i = 0; i < 20; i+=2) {
            int finalI = i;
            JPanel curPanel = new JPanel() {
                @Override
                public void paint(Graphics g) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2.setColor(colors[Math.abs(random.nextInt()) % 6]);
                    //int choice = Math.abs(random.nextInt()) % 2;
                    g2.fillRect(10 + (finalI % 5) * 120, 10 + (finalI / 5) * 120, 100, 100);
                    g2.fillOval(10 + ((finalI + 1) % 5) * 120, 10 + ((finalI + 1) / 5) * 120, 100, 100);
                    /*
                    if (choice == 0) {
                        g2.fillRect(10 + (finalI % 5) * 120, 10 + (finalI / 5) * 120, 100, 100);
                    } else {
                        g2.fillOval(10 + ((finalI + 1) % 5) * 120, 10 + ((finalI + 1) / 5) * 120, 100, 100);
                    }
                     */
                }
            };
            add(curPanel);
            setVisible(true);
        }
    }
}
