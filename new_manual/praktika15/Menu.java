import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class Menu extends JFrame {
    final private JComboBox menu;
    private JLabel labelStart, labelChoose;
    private Font font1 = new Font("TimesRoman", Font.BOLD, 24);
    Menu(){
        setSize(2000, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String [] stringMenu = {"Australia", "China", "England", "Russia"};
        menu = new JComboBox<>(stringMenu);
        menu.setBounds(80, 50, 140, 20);
        menu.setFont(font1);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (menu.getSelectedItem() == "Australia")
                    labelChoose.setText("Австралия - государство в Южном полушарии, занимающее одноимённый материк, остров Тасмания и несколько других островов Индийского и Тихого океанов.");
                else if (menu.getSelectedItem() == "China")
                    labelChoose.setText("Китай — государство в Восточной Азии. Занимает третье место в мире по территории (9 598 962 км2), уступая России и Канаде.");
                else if (menu.getSelectedItem() == "England")
                    labelChoose.setText("А́нглия — страна, являющаяся крупнейшей административно-политической частью Соединённого Королевства Великобритании и Северной Ирландии.");
                else labelChoose.setText("Росси́я — государство в Восточной Европе и Северной Азии. Россия — крупнейшее государство в мире.");
            }
        });

        labelStart = new JLabel("Выберите страну: ");
        labelStart.setBounds(90, 100, 400, 100);
        labelStart.setFont(font1);

        labelChoose = new JLabel("Страна не выбрана");
        labelChoose.setBounds(90, 100, 400, 100);
        labelChoose.setFont(font1);

        add(labelStart);
        add(menu);
        add(labelChoose);
        setVisible(true);
    }

    public static void main(String [] args){
        new Menu();
    }
}