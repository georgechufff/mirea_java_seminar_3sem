import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton buttonPlus = new JButton(" Сложить числа");
    JButton buttonMinus = new JButton(" Вычесть числа");
    JButton buttonMultiplication = new JButton(" Умножить числа");
    JButton buttonDivision = new JButton(" Делить числа");
    Font fnt = new Font("TimesRoman", 0, 25);
    Calculator(){
        //super("Calculator");
        setTitle("Задание 1 - примитивный калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(500,300);

        JLabel jl1 = new JLabel("Первое число");
        jl1.setFont(fnt);
        add(jl1);

        jta1.setFont(fnt);
        add(jta1);

        JLabel jl2 = new JLabel("Второе число");
        jl2.setFont(fnt);
        add(jl2);

        jta2.setFont(fnt);
        add(jta2);

        buttonPlus.setFont(fnt);
        add(buttonPlus);

        buttonMinus.setFont(fnt);
        add(buttonMinus);

        buttonMultiplication.setFont(fnt);
        add(buttonMultiplication);

        buttonDivision.setFont(fnt);
        add(buttonDivision);

        buttonPlus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = " + (x1 + x2),
                            "Успех",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Были введены некорректные числа!",
                            "Ошибка" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonMinus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2),
                            "Успех",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Были введены некорректные числа!",
                            "Ошибка" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonMultiplication.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2),
                            "Успех",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Были введены некорректные числа!",
                            "Ошибка" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonDivision.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    if (x2 == 0){
                        JOptionPane.showMessageDialog( null, "На ноль делить нельзя!",
                                "Ошибка" , JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2),
                                "Успех", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Были введены некорректные числа!",
                            "Ошибка" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[]args){
        new Calculator();
    }
}