package lesson03;

import javafx.application.Application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("E:\\Java\\JavaAdvanced\\MessagesBundle_de_DE.properties");
        System.out.println(Files.exists(path));
        System.out.println();

    }
}
