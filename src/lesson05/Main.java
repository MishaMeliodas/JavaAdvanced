package lesson05;


import lesson04.Jun;

import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Main extends JFrame {
    public Main() throws MalformedURLException {
        super("123");
        setVisible(true);
        setSize(300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        URL url = getClass().getClassLoader().getResource("1.png");
        JLabel jLabel = new JLabel(new ImageIcon(url));
        JLabel jLabel1 = new JLabel(url.getPath());
        JPanel jPanel = new JPanel();
        jPanel.add(jLabel);
        jPanel.add(jLabel1);
        add(jPanel);

    }

    public static void main(String[] args) throws MalformedURLException {
        new Main();
    }
}
