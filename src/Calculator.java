import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel Main;
    private JButton button1;
    private JButton zero;
    private JButton percent;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton equal;
    private JButton add;
    private JButton substr;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton multi;
    private JButton div;
    private JButton clear;
    private JTextField textField1;
    private JButton nButton;
    private JButton x2Button;
    private JButton x3Button;
    private JButton xYButton;
    private JButton a1XButton;
    private JButton logButton;
    private JButton backspace;
    private JButton sinhButton;
    private JButton coshButton;
    private JRadioButton on;
    private JButton dod;
    private JRadioButton off;
    private JButton tanhButton;
    private JButton rButton;
    private JButton eXButton;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private Double first;
    private double second;
    private double result;
    private String operation;


    public Calculator() {
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + zero.getText();
                textField1.setText(number);
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + one.getText();
                textField1.setText(number);
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + two.getText();
                textField1.setText(number);
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + three.getText();
                textField1.setText(number);
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + four.getText();
                textField1.setText(number);
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + five.getText();
                textField1.setText(number);
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + six.getText();
                textField1.setText(number);
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + seven.getText();
                textField1.setText(number);
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + eight.getText();
                textField1.setText(number);
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText() + nine.getText();
                textField1.setText(number);
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(null);
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "+";
            }
        });
        substr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "-";
            }
        });
        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "*";
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "/";
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer;
                second = Double.parseDouble(textField1.getText());
                if (operation == "+") {
                    result = first + second;
                    answer = String.format("%.1f", result);
                    textField1.setText(answer);
                } else if (operation == "-") {
                    result = first - second;
                    answer = String.format("%.2f", result);
                    textField1.setText(answer);
                } else if (operation == "*") {
                    result = first * second;
                    answer = String.format("%.2f", result);
                    textField1.setText(answer);
                } else if (operation == "/") {
                    result = first / second;
                    answer = String.format("%.2f", result);
                    textField1.setText(answer);
                } else if (operation == "%") {
                    result = first % second;
                    answer = String.format("%.2f", result);
                    textField1.setText(answer);
                } else if (operation == "X^Y") {
                    double resultt = 1;
                    for (int i = 0; i < second; i++) {
                        resultt = first * resultt;
                    }
                    answer = String.format("%.2f", resultt);
                    textField1.setText(answer);
                }
            }
        });


        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String back = null;
                if (textField1.getText().length() > 0) {
                    StringBuilder builder = new StringBuilder(textField1.getText());
                    builder.deleteCharAt(textField1.getText().length() - 1);
                    back = builder.toString();
                    textField1.setText(back);
                }
            }
        });
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Math.sin(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + a);
            }
        });
        sinhButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Math.sinh(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + a);
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Math.cos(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + a);
            }
        });
        coshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Math.cosh(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + a);
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Math.tan(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + a);
            }
        });
        tanhButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Math.tanh(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + a);
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Math.log(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + a);
            }
        });
        eXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = 1 / (Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + a);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(String.valueOf(textField1.getText()));
                a *= -1;
                textField1.setText(String.valueOf(a));
            }
        });
        nButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(textField1.getText());
                double fact = 1;
                while (a != 0) ;
                {
                    fact = fact * a;
                    a--;
                }
                textField1.setText("");
                textField1.setText(textField1.getText() + fact);
            }
        });
        x2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(textField1.getText());
                a *= a;
                textField1.setText("");
                textField1.setText(textField1.getText() + a);
            }
        });
        x3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(textField1.getText());
                a *= a * a;
                textField1.setText("");
                textField1.setText(textField1.getText() + a);
            }
        });
        rButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Math.sqrt(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText() + a);
            }
        });
        xYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "X^Y";
            }
        });
        off.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(null);
                button1.setEnabled(false);
                zero.setEnabled(false);
                percent.setEnabled(false);
                one.setEnabled(false);
                two.setEnabled(false);
                three.setEnabled(false);
                four.setEnabled(false);
                five.setEnabled(false);
                six.setEnabled(false);
                equal.setEnabled(false);
                add.setEnabled(false);
                substr.setEnabled(false);
                seven.setEnabled(false);
                eight.setEnabled(false);
                nine.setEnabled(false);
                multi.setEnabled(false);
                div.setEnabled(false);
                clear.setEnabled(false);
                textField1.setEnabled(false);
                nButton.setEnabled(false);
                x2Button.setEnabled(false);
                x3Button.setEnabled(false);
                xYButton.setEnabled(false);
                a1XButton.setEnabled(false);
                logButton.setEnabled(false);
                backspace.setEnabled(false);
                sinhButton.setEnabled(false);
                coshButton.setEnabled(false);
                dod.setEnabled(false);
                tanhButton.setEnabled(false);
                rButton.setEnabled(false);
                eXButton.setEnabled(false);
                sinButton.setEnabled(false);
                cosButton.setEnabled(false);
                tanButton.setEnabled(false);
            }
        });
        on.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(true);
                zero.setEnabled(true);
                percent.setEnabled(true);
                one.setEnabled(true);
                two.setEnabled(true);
                three.setEnabled(true);
                four.setEnabled(true);
                five.setEnabled(true);
                six.setEnabled(true);
                equal.setEnabled(true);
                add.setEnabled(true);
                substr.setEnabled(true);
                seven.setEnabled(true);
                eight.setEnabled(true);
                nine.setEnabled(true);
                multi.setEnabled(true);
                div.setEnabled(true);
                clear.setEnabled(true);
                textField1.setEnabled(true);
                nButton.setEnabled(true);
                x2Button.setEnabled(true);
                x3Button.setEnabled(true);
                xYButton.setEnabled(true);
                a1XButton.setEnabled(true);
                logButton.setEnabled(true);
                backspace.setEnabled(true);
                sinhButton.setEnabled(true);
                coshButton.setEnabled(true);
                dod.setEnabled(true);
                tanhButton.setEnabled(true);
                rButton.setEnabled(true);
                eXButton.setEnabled(true);
                sinButton.setEnabled(true);
                cosButton.setEnabled(true);
                tanButton.setEnabled(true);
                off.setEnabled(true);
            }
        });
        percent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "%";
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scientific Calculator");
        frame.setContentPane(new Calculator().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(380, 500);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(123,50,250));
    }
}


