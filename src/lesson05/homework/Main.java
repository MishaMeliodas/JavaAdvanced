package lesson05.homework;

import javax.swing.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main extends JFrame {


    public Main() throws IOException {
        setVisible(true);
        ImageIcon imageIcon1 = new ImageIcon("newyork.jpg");
        URL url = getClass().getClassLoader().getResource("aloha.jpg");
        FileInputStream fileReader = new FileInputStream(new File("1.txt"));
        System.out.println(fileReader);
        ImageIcon imageIcon2 = new ImageIcon(url);
        JLabel jLabel = new JLabel(imageIcon1);
        JLabel jLabel1 = new JLabel(imageIcon2);
        JPanel jPanel = new JPanel();
        jPanel.add(jLabel);
        jPanel.add(jLabel1);
        setSize(600, 600);
        add(jPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
    public String readFile(String filePath){
        try(FileInputStream ) {
            FileInputStream fileInputStream = new FileInputStream(new File("1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
