package calculator;

import javax.swing.*;

public class Main {

    public static final int FRAME_X = 500;
    public static final int FRAME_Y = 0;
    public static final int FRAME_WIDTH = 600;
    public static final int FRAME_HEIGHT = 800;

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Calculator");
        frame.setVisible(true);

        // Set exit behaviour
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        // Set position and size of frame
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLocationRelativeTo(null);          // Sets frame to center of the screen
    }
}
