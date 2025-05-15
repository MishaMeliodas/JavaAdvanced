package lesson01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = null;
        scanner = new Scanner(new BufferedReader(new FileReader("E:\\Java\\JavaAdvanced\\1.txt")));
        while (scanner.hasNext()) {
            if(scanner.hasNextDouble()) {
                String str = scanner.next();
                try {
                    if(str.contains(",")){
                       str =  str.replace(",", ".");
                    }
                    Integer.valueOf(str);
                } catch (Exception e) {
                    System.out.println(Double.parseDouble(str));
                }
            }
            else{
                scanner.next();
            }
        }
    }
}
