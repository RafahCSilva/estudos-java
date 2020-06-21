package rcs.rafahcsilva;

import rcs.rafahcsilva.default_code.Default;
import rcs.rafahcsilva.private_code.Private;
import rcs.rafahcsilva.protected_code.Protected;
import rcs.rafahcsilva.protected_code.Second;
import rcs.rafahcsilva.public_code.Public;

import java.io.*;
import java.lang.annotation.Annotation;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Encapsulamento
        new Public();
        new Private();
        new Protected();
        new Second();
        new Default();


        // Java.Lang - Object
        Public pub = new Public();
        Object obj = new Object();
        System.out.println(obj.toString());
        System.out.println(pub.toString());


        // Java.Lang - Wrappers
        Integer one = 1;
        int two = 2;
        Double d1 = 0.0;
        String str1 = d1.toString();


        // Java.Lang - Annotations
        Class<Public> pubClass = Public.class;
        if (pubClass.isAnnotationPresent(Info.class)) {
            Annotation annotation = pubClass.getAnnotation(Info.class);
            Info info = (Info) annotation;
            System.out.println("@Info eh " + info.createdBy());
        }


        // Java.IO - File
        File file = new File("test.txt");
        FileOutputStream fos;
        try {
            if (file.createNewFile()) {
                System.out.println("FIle is Created");
            } else {
                System.out.println("File already exists");
            }

            // Java IO - FileOutputStream
            fos = new FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }

            String text = "Hello, my name is Rafao and I'm study Java";
            byte[] textByte = text.getBytes();
            fos.write(textByte);
            fos.flush();
            fos.close();
            System.out.println("Write Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Java IO - BufferedRead
        BufferedReader br;
        BufferedInputStream bis;
        FileInputStream fis;
        String currentLine;
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            System.out.println("Reading files:");
            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
            }
            br.close();
            System.out.println("Buffer Read Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Java IO - FileInputStream
        try {
            System.out.println("Preparing to read...");
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);
            while (dis.available() != 0) {
                System.out.println(dis.readLine());
            }
            fis.close();
            bis.close();
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
