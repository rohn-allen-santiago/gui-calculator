package calculator;

import javax.swing.*;
import java.awt.*;

public class Display {

    public static final int FRAME_WIDTH = 600;
    public static final int FRAME_HEIGHT = 800;
    public static final int BUTTON_PANEL_X = 0;
    public static final int BUTTON_PANEL_Y = 170;
    public static final int BUTTON_PANEL_WIDTH = 600;
    public static final int BUTTON_PANEL_HEIGHT = 600;
    public static final int TEXT_PANEL_X = 0;
    public static final int TEXT_PANEL_Y = 0;
    public static final int TEXT_PANEL_WIDTH = 600;
    public static final int TEXT_PANEL_HEIGHT = 170;

    String[] buttonChars = {"7", "8", "9", "/",
                            "4", "5", "6", "*",
                            "1", "2", "3", "-",
                            "0", "C", "=", "+"};
    JButton[] buttons = new JButton[buttonChars.length];

    JFrame frame;

    // Constructor for creating calculator
    Display() {
        this.frame = new JFrame("Calculator");
    }

    // Function for initializing calculator
    public void calculator() {

        // Set JFrame parameters
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        // Create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(BUTTON_PANEL_X, BUTTON_PANEL_Y, BUTTON_PANEL_WIDTH, BUTTON_PANEL_HEIGHT);
        buttonPanel.setLayout(new GridLayout(4,4));
        buttonPanel.setBackground(Color.black);
        frame.add(buttonPanel);

        // Add buttons to grid
        for(int i = 0; i < buttons.length; i++) {
            JButton b = new JButton(buttonChars[i]);
            b.setFont(new Font("Calibiri", Font.PLAIN, 20));
            b.setBackground(Color.black);
            b.setForeground(Color.white);
            buttons[i] = b;
            buttonPanel.add(b);
        }

        // Add text display to frame
        JLabel text = new JLabel(" 123456789");
        text.setFont(new Font("Calibri", Font.PLAIN, 40));
        text.setOpaque(true);
        text.setBackground(Color.gray);
        text.setForeground(Color.black);
        text.setBounds(TEXT_PANEL_X, TEXT_PANEL_Y, TEXT_PANEL_WIDTH, TEXT_PANEL_HEIGHT);
        text.setAlignmentX(Label.LEFT);
        frame.add(text);
    }
}
