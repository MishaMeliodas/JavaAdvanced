package lesson02;

import java.io.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
     /*   Console console = System.console();
        if (console == null) {
            System.err.println("Not console found");
            System.exit(-1);
        }
        String login = console.readLine();
        char[] password = console.readPassword();
        System.out.println("Login: " + login);
        System.out.println("Paswword: " + password);
        */
        /*Pudge pudge = null;
        try(DataInputStream dis = new DataInputStream(new FileInputStream("pudge.bin"))){
            pudge = new Pudge();
            pudge.setName(dis.readUTF());
            pudge.setLeve(dis.readInt());
            System.out.println("Pudge reading complete");
            System.out.println(pudge);
        } catch (Exception e) {
            System.out.println("Some error " + e.getMessage());
        }*/

 /*       String language = "en";
        String country = "US";
        if (args.length == 2) {
            language = args[0];
            country = args[1];
        }

        Locale locale = new Locale(language, country);
        ResourceBundle bundle = ResourceBundle.getBundle("MessagesBundle", locale);
        System.out.println("Locale: " + locale);
        System.out.println("Greetings: " + bundle.getString("greetings"));
        System.out.println("Bye: " + bundle.getString("bye"));*/
        /*Pudge pudge = new Pudge("Pudge", 10);
        FileOutputStream fos = new FileOutputStream("somePudge.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(pudge);*/

        FileInputStream fis = new FileInputStream("somePudge.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Pudge pudge = (Pudge) ois.readObject();
        System.out.println(pudge);


    }
}
