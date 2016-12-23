package Test11_swing;

import javax.swing.*;
import java.awt.*;

public class MyWindow1 extends JFrame {
    static JTextArea textArea;

    public MyWindow1() throws HeadlessException {
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java dive");

        textArea = new JTextArea();
        add(textArea);
        for (int i = 0; i < 20; i++) {
            textArea.append("just do it...\n");
        }
        add(new JButton("go"), BorderLayout.SOUTH);

        setVisible(true);
    }
}
