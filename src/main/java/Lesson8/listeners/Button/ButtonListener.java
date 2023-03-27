package Lesson8.listeners.Button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Контракт на исполнение
public class ButtonListener implements ActionListener {

    //возьмем конструктор
    private JTextField inputField;

    public ButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }


    //принимать экземпляр поля, размещение текста в поле
    @Override
    //ActionEvent e - событие (Нажать на кнопку будет событием)
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        inputField.setText(inputField.getText()+ "" + btn.getText());
    }
}
