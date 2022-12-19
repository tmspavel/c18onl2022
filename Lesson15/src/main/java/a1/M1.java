package a1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class M1 {
    public static final String OUTPUT_FILE = "Lesson15/src/main/resources/output.txt";

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {//(FileOutputStream fos = new FileOutputStream(OUTPUT_FILE, false)){
            fos = new FileOutputStream(OUTPUT_FILE, true);
            fos.write("\neee".getBytes(StandardCharsets.UTF_8));
        } catch (Exception exception) {
            System.out.println("Unexpected error " + exception);
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException exception) {
                System.out.println("Unexpected error " + exception);
            }
        }
    }
}
