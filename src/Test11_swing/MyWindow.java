package Test11_swing;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() throws HeadlessException {
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java dive");
//        JButton jButton = new JButton("Learn java");
        add(new JButton("Java"), BorderLayout.SOUTH);
        add(new JButton("Java1"), BorderLayout.WEST);
        add(new JButton("Java2"), BorderLayout.EAST);
        add(new JButton("Java3"), BorderLayout.NORTH);
        setVisible(true);
    }
}
