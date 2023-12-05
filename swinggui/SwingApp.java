package swinggui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingApp {
    // Method to create and show the GUI
    private static void createAndShowGUI() {
        // Creating the window (JFrame)
        JFrame frame = new JFrame("Basic Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adding a text label (JLabel)
        JLabel label = new JLabel("Hello, World!");
        frame.getContentPane().add(label);

        // Setting the frame size and making it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Ensuring GUI creation is done in the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
