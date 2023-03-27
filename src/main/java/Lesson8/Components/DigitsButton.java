package Lesson8.Components;

import javax.swing.*;
import java.awt.*;

//Сделали новый пакет с компонентами и создали кнопку , в этой кнопке наследуемся и прописывем extends
public class DigitsButton extends JButton {
    public DigitsButton(String text) {
        super(text);
        setFont(new Font("TimesRoman", Font.PLAIN,25));
        setBackground(new Color(54, 220, 248));

    }
}
