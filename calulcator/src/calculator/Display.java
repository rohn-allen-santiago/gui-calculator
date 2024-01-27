package calculator;

import javax.swing.*;
import java.awt.*;

public class Display {

    public static final int FRAME_X = 500;
    public static final int FRAME_Y = 0;
    public static final int FRAME_WIDTH = 600;
    public static final int FRAME_HEIGHT = 800;

   Display() {

        // Create JFrame
        JFrame frame = new JFrame("Calculator");
        frame.setVisible(true);

        // Set exit behaviour
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        // Set size of frame
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Sets frame to center of the screen
        frame.setLocationRelativeTo(null);

        // Set grid layout of frame
        frame.setLayout(new GridLayout(4,4));

    }
}
