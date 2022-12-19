package a1;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static final String OUTPUT_FILE = "Lesson14/src/main/resources/output.txt";

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(OUTPUT_FILE, false);
            fos.write("eee".getBytes());
        } catch (Exception exception) {
            System.out.println("Unexpected error " + exception);
        } finally {
            try {
                fos.close();
            } catch (IOException exception) {
                System.out.println("Unexpected error " + exception);
            }
        }
//        } catch (FileNotFoundException e) {
//            System.out.println("Unexpected error " + e);
//        } catch (IOException exception) {
//            System.out.println("IOException error " + exception);
//        }


        try {
            fos = new FileOutputStream(OUTPUT_FILE);
            fos.write("sdfsdfds".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }


        //запись в файл
        try (FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE, false);
             FileOutputStream fileOutputStream2 = new FileOutputStream(OUTPUT_FILE, true)) {
            fileOutputStream.write("\nsdjklsdjf fdslfj".getBytes());
            fileOutputStream2.write("sadsa".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.out.println("Unexpected error " + e);
        }

//        //считать из файла
        try (FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE)) {
            final byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            System.out.println(new String(bytes));
        } catch (IOException exception) {
            System.out.println("Unexpected error in read method " + exception);
        }
//
//

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(OUTPUT_FILE))) {
            bos.write("sdjklsdjf fdslfj".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
