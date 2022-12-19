package a1;

import java.io.FileInputStream;
import java.io.IOException;

public class M2 {
    public static final String OUTPUT_FILE = "Lesson15/src/main/resources/input.txt";

    public static void main(String[] args) {
//        "привет".getBytes(StandardCharsets.UTF_8);
        try (FileInputStream fileInputStream = new FileInputStream(OUTPUT_FILE)) {
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            System.out.println(new String(bytes));
//            StringBuilder stringBuilder = new StringBuilder();
//            int value;
//            while ((value = fileInputStream.read()) != -1) {
//                stringBuilder.append((char) value);
//            }
//            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            System.out.println("Unexpected error " + e.getMessage());
        }


//        FileInputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream(OUTPUT_FILE);
////            byte[] buffer = new byte[12];
//            StringBuilder stringBuilder = new StringBuilder();
//            int value;
//            while ((value = inputStream.read()) != -1) {
//                stringBuilder.append((char) value);
//            }
//            System.out.println(stringBuilder.toString());
//        } catch (Exception exception) {
//            System.out.println("Unexpected error " + exception);
//        } finally {
//            try {
//                if (inputStream != null) {
//                    inputStream.close();
//                }
//            } catch (IOException exception) {
//                System.out.println("Unexpected error " + exception);
//            }
//        }
    }
}
