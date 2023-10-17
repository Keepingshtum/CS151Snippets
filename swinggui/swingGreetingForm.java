package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingGreetingForm {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Greeting Form");
        JPanel panel = new JPanel();
        JLabel nameLabel = new JLabel("Enter your name:");
        panel.add(nameLabel);


        JTextField nameField = new JTextField(20);
        panel.add(nameField);

        JButton greetButton = new JButton("Greet");

        //This next bit of code does all of the magic in this form
        greetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the text from the name field
                String name = nameField.getText();

                // Show a dialog with the greeting message
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
            }
        });
        panel.add(greetButton);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
