package ex3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ex3 extends JFrame {
    JLabel service_lbl, user_name_lbl, passwd_lbl;
    JTextArea service_txt, user_name_txt, passwd_txt;
    Font font = new Font("Times New Roman", Font.PLAIN, 24);
    ex3(){
        setTitle("Password application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(500, 270);
        setLayout(null);
        Border brdr = BorderFactory.createLineBorder(Color.BLACK, 1);

        service_lbl = new JLabel("Service:");
        service_lbl.setBounds(50, 20, 150, 35);
        service_lbl.setFont(font);

        user_name_lbl = new JLabel("User name:");
        user_name_lbl.setBounds(50, 70, 150, 35);
        user_name_lbl.setFont(font);

        passwd_lbl = new JLabel("Password:");
        passwd_lbl.setBounds(50, 120, 150, 35);
        passwd_lbl.setFont(font);

        service_txt = new JTextArea();
        service_txt.setBounds(170, 20, 300, 35);
        service_txt.setBorder(brdr);
        service_txt.setFont(font);

        user_name_txt = new JTextArea();
        user_name_txt.setBounds(170, 70, 300, 35);
        user_name_txt.setBorder(brdr);
        user_name_txt.setFont(font);

        passwd_txt = new JTextArea();
        passwd_txt.setBounds(170, 120, 300, 35);
        passwd_txt.setBorder(brdr);
        passwd_txt.setBorder(brdr);

        add(service_txt);
        add(service_lbl);
        add(user_name_lbl);
        add(user_name_txt);
        add(passwd_lbl);
        add(passwd_txt);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                titleAlign();
            }
        });
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void titleAlign() {

        Font font = getFont();

        String currentTitle = getTitle().trim();
        FontMetrics tmp_fm = getFontMetrics(font);
        int frameWidth = getWidth();
        int titleWidth = tmp_fm.stringWidth(currentTitle);
        int spaceWidth = tmp_fm.stringWidth(" ");
        int centerPos = (frameWidth / 2) - (titleWidth / 2);
        int spaceCount = centerPos / spaceWidth;
        String pad = "";
        pad = String.format("%" + (spaceCount - 14) + "s", pad);
        setTitle(pad + currentTitle);
    }

    public static void main(String [] args){
        new ex3();
    }
}