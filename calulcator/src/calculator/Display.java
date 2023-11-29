package calculator;

import javax.swing.*;

public class Display {

    private JLabel display;

    public Display() {
        display = new JLabel();
    }

    public JLabel getDisplay() {
        return display;
    }

    public void setDisplay(JLabel display) {
        this.display = display;
    }
}
