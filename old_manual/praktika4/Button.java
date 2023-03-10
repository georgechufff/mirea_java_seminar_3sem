import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JPanel {
    private int Milan=0, Madrid=0;
    private JButton button, button2, button1;
    private JLabel jLabel, jLabel1, jLabel2;
    private Font font1, font2, font3;
    public Button() {
        //подключение шрифтов
        font1 = new Font("Verdana", 1, 25);
        font2 = new Font("Verdana", 0, 20);
        font3 = new Font("Verdana", 0, 30);
        //Надпись с результатами
        jLabel = new JLabel("Result: 0 X 0");
        setLayout(null);
        jLabel.setBounds(375,20,250,40);
        jLabel.setFont(new Font("Verdana", Font.BOLD, 25));
        jLabel.setVisible(true);
        add(jLabel);

        //Кто последний забил
        jLabel1 = new JLabel("Last Scorer: N/A");
        jLabel1.setBounds(200,70,200,40);
        jLabel1.setFont(font2);
        jLabel1.setVisible(true);
        add(jLabel1);

        jLabel2 = new JLabel("Winner: DRAW");
        jLabel2.setBounds(600,70,200,40);
        jLabel2.setFont(font2);
        jLabel2.setVisible(true);
        add(jLabel2);

        //Свойства первой кнопки
        button = new JButton("Милан");
        button.setFont(font3);
        button.setBounds(100,200,350,100);
        button.setVisible(true);
        add(button);

        //Свойства второй кнопки
        button1 = new JButton("Мадрид");
        button1.setFont(font3);
        button1.setBounds(550,200,350,100);
        button1.setVisible(true);
        add(button1);

        //Вывод результата матча
        button2 = new JButton("Завершить матч");
        button2.setFont(font3);
        button2.setBounds(325,400,350,100);
        button2.setVisible(true);
        add(button2);

        pushMadrid();
        pushMilan();
        pushENDING_GAME();
    }
    void pushMilan(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Milan++;
                jLabel1.setText("Last Scorer: Milan");
                jLabel.setText("Result: "+Integer.toString(Milan)+" X "+Integer.toString(Madrid));
            }
        });
    }
    void pushMadrid(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Madrid++;
                jLabel1.setText("Last Scorer: Madrid");
                jLabel.setText("Result: "+Integer.toString(Milan)+" X "+Integer.toString(Madrid));
            }
        });
    }
    void pushENDING_GAME(){
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Madrid > Milan) jLabel2.setText("Winner: Madrid");
                else if (Madrid < Milan) jLabel2.setText("Winner: Milan");
                else jLabel2.setText("Winner: DRAW");
            }
        });
    }
}