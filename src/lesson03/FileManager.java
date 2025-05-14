package lesson03;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        String path = new String("E:\\JavaRushTasks");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(path + " ");
            String s = scanner.nextLine();
            if (s.equals("dir")) {
                showFiles(path);
            } else if (s.equals("..")) {
                path = getBack(path);
            } else if (s.startsWith("cd ")) {
                path = forward(s, path);
            } else if (s.equals("exit")) {
                break;
            } else {
                System.out.println("Unknown Command");
            }
        }
    }

    private static void showFiles(String path) {
        File file = new File(path);
        for (File f : file.listFiles()) {
            if (f.isDirectory()) {
                System.out.println(f);
            }
        }
        for (File f : file.listFiles()) {
            if (f.isFile()) {
                System.out.println(f);
            }
        }
    }

    private static String getBack(String path) {
        String parent = new File(path).getParent();
        return (parent == null) ? path : parent;
    }

    private static String forward(String scanner, String path) {
        String[] parts = scanner.trim().split(" ", 2);
        if (parts.length < 2 || parts[1].isEmpty()) {
            return path;
        }
        String newPath = path + "\\" + scanner.substring(scanner.indexOf(" ") + 1);
        File file = new File(newPath);
        if (file.isDirectory() && file.exists()) {
            return newPath;
        } else {
            return path;
        }
    }
}
