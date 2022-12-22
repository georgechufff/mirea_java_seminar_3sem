package ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex2 extends JFrame {
    ex2(){
        setSize(600, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        String [] colours = {"Синий", "Красный", "Черный"};
        String [] fonts = {"Times New Roman", "MS Sans Serif", "CourierNew", "ComicSans"};

        Font [] fontss = {
                new Font("Times New Roman", Font.PLAIN, 24),
                new Font("MS Sans Serif", Font.PLAIN, 24),
                new Font("Courier New", Font.PLAIN, 24),
                new Font("Comic Sans", Font.PLAIN, 24)
        };

        JTextArea text = new JTextArea();
        text.setBounds(300, 70, 250, 50);
        text.setFont(fontss[0]);

        JComboBox<String> menuColours = new JComboBox<>(colours);
        JComboBox<String> menuFonts = new JComboBox<>(fonts);

        menuColours.setBounds(20, 50, 240, 40);
        menuFonts.setBounds(20, 100, 240, 40);

        menuColours.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (menuColours.getSelectedItem() == "Синий"){
                    text.setForeground(Color.BLUE);
                }
                else if (menuColours.getSelectedItem() == "Красный")
                    text.setForeground(Color.RED);
                else text.setForeground(Color.BLACK);
            }
        });

        menuFonts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (menuFonts.getSelectedItem() == fonts[0])
                    text.setFont(fontss[0]);
                else if (menuFonts.getSelectedItem() == fonts[1])
                    text.setFont(fontss[1]);
                else if (menuFonts.getSelectedItem() == fonts[2])
                    text.setFont(fontss[2]);
                else {
                    text.setFont(fontss[3]);
                }
            }
        });

        add(menuColours);
        add(menuFonts);
        add(text);
        setVisible(true);
    }

    public static void main(String [] args){
        new ex2();
    }
}
