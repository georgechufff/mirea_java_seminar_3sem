package ex1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameTemplate frame1 = new JFrameTemplate();
            }
        });
    }
}
