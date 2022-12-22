import javax.swing.*;
import java.awt.*;

public class MaxMenu extends JFrame {
    Font font1 = new Font("TimesRoman", Font.BOLD, 24);
    MaxMenu() {
        setTitle("Практическая работа №15 - часть 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2, 20 , 30));
        setSize(2000, 600);
        JMenuBar fullMenu = new JMenuBar();

        // Первая часть меню
        String [] strFiles = {"Сохранить", "Выйти", "Правка"};
        JMenu file = createJMenu(strFiles, "File");

        fullMenu.add(file);

        // Вторая часть меню
        String [] strEdit = {"Копировать", "Вырезать", "Вставить"};
        JMenu edit = createJMenu(strEdit, "Edit");
        fullMenu.add(edit);

        // Третья часть меню
        String [] strHelp = {"Справка"};
        JMenu help = createJMenu(strHelp, "Help");
        fullMenu.add(help);

        setJMenuBar(fullMenu);

        JButton button1 = new JButton("Кнопка №1");
        JButton button2 = new JButton("Кнопка №2");

        button1.setBounds(20, 20, 25, 15);
        button1.setFont(font1);
        button2.setBounds(20, 20, 25, 15);
        button2.setFont(font1);

        JTextArea text = new JTextArea("Область, в которой мы можете писать текст");
        text.setBounds(50, 50, 50, 50);
        text.setFont(font1);

        add(button1);
        add(button2);
        add(text);
        setVisible(true);
    }

    private JMenu createJMenu(String [] items, String name){
        JMenu ans = new JMenu(name);
        for (String item : items)
            ans.add(new JMenuItem(item));
        return ans;
    }

    public static void main(String [] args){
        new MaxMenu();
    }
}