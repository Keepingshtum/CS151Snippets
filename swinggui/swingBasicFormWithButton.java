package swinggui;

import javax.swing.*;

public class swingBasicFormWithButton {
    private JButton letSGoButton;
    private JTextPane thisIsSomeCoolTextPane;
    private JPanel rootPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TestForm");
        frame.setContentPane(new swingBasicFormWithButton().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //What does this do? Find out here https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html
        frame.pack();
        frame.setVisible(true);
    }
}
