package calculator;

import javax.swing.*;

public class Display {

    private JLabel display;

    public Display() {
        display = new JLabel();
        display.setHorizontalAlignment(JLabel.LEFT);
        display.setVerticalAlignment(JLabel.CENTER);
    }

    public JLabel getDisplay() {
        return display;
    }

    public void setDisplay(JLabel display) {
        this.display = display;
    }

    public void updateText(String symbol) {
        String currentText = display.getText();
        display.setText(currentText + symbol);
    }
}
