package Lesson8;

import Lesson8.Components.DigitsButton;
import Lesson8.Components.OperatorJButton;
import Lesson8.listeners.Button.ButtonListener;
import Lesson8.listeners.Button.ClearFieldButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {


    private JTextField inputField;

    public ApplicationForm(String tittle) {
        super(tittle);
        setBounds(300, 400, 100, 130);//поменять
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);


        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH);

        setJMenuBar(createMenu());

        add(createCenterPanel(), BorderLayout.CENTER);

        //add(new Button ("Кнопка"), BorderLayout.EAST);
        //add(new Button ("Кнопка"), BorderLayout.WEST);

        setVisible(true);
    }


    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem clear = new JMenuItem("Clear");
        clear.addActionListener(new ClearFieldButtonListener(inputField));
        menuFile.add(clear);

        menuFile.add(new JMenuItem("Exit"));
        menuBar.add(menuFile);

        menuBar.add(new JMenuItem("help"));
        menuBar.add(new JMenuItem("About"));

         //Кнопка выхода (Описание двумя способоми)
        //Это анонимный класс (Длинный путь)
       /* exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        System.exit(0);
            }
        });*/
        //Можно сделать еще короче, добавил слушатель и сразу exit
        //Это лямдо выражение (простой способ)
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(e -> System.exit(0));
        menuBar.add(exit);

        return menuBar;
    }

    //Топ Панель содержит в себе поле для ввода примеров
    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);
        inputField.setFont(new Font("Arial", Font.PLAIN, 25));
        inputField.setMargin(new Insets(8, 0, 8, 0));
        inputField.setBackground(new Color(39, 205, 25, 159));

    //   inputField.setText("(1+2)/3 = 12");

        return top;
    }

    //Панель отдает нам все содержимое из кнопок, которое состоит из кнопок, которые являются цифрами и операторами
    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField);

        centerPanel.add(createDigitsPanel(buttonListener), BorderLayout.CENTER);
        centerPanel.add(createOperatorsPanel(buttonListener), BorderLayout.WEST);

        return centerPanel;
    }

    private JPanel createDigitsPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();
        //Сделаем сетку из чисел (В гид лояут сделаем сетку и в скобках укахываем кол-во столбцов и  строк
        digitsPanel.setLayout(new GridLayout(4,3));
        //создаем кнопку (Указываем значение в скобках), чтобы было проще, сделаем в цикле

        for (int i =0; i<10; i++){
            String buttonTitle = (i == 9)? "0": String.valueOf(i+1);
            JButton btn = new DigitsButton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }

        //= и очистить
        JButton calc = new OperatorJButton("=");
        digitsPanel.add(calc);
        calc.setEnabled(false);

        JButton clear = new OperatorJButton("C");
        clear.addActionListener(new ClearFieldButtonListener(inputField));
        digitsPanel.add(clear);

        return digitsPanel;
    }

    private JPanel createOperatorsPanel(ActionListener buttonListener) {
        JPanel panel = new JPanel();
      //Добавим еще панель с операторами
        panel.setLayout(new GridLayout(4,1));


        JButton minus = new OperatorJButton("-");
        minus.addActionListener(buttonListener);
        panel.add(minus);

        JButton plus = new OperatorJButton("+");
        plus.addActionListener(buttonListener);
        panel.add(plus);

        JButton multiply = new OperatorJButton("x");
        multiply.addActionListener(buttonListener);
        panel.add(multiply);

        JButton divide = new OperatorJButton("/");
        divide.addActionListener(buttonListener);
        panel.add(divide);

        return panel;
    }
}

//Домашка: Сделать так, чтобы калькулятор мог вычислять, при нажатии равно
//Создать слушателя, который будет просчитывать кнопочку равенство

