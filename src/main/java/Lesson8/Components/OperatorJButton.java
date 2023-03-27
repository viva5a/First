package Lesson8.Components;

import javax.swing.*;
import java.awt.*;

//Сделали новый пакет с компонентами и создали кнопку , в этой кнопке наследуемся и прописывем extends
public class OperatorJButton extends JButton {
    public OperatorJButton(String text) {
        super(text);
        setFont(new Font("TimesRoman", Font.PLAIN,30));
        setBackground(new Color(255, 207, 4));

    }
}
