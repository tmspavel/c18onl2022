package a1;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {

//        Walkable dog1 = new Dog("Барсик");
//        try {
//            dog1.walk();
//        } catch (DogIsNotReadyException e) {
//            System.out.println("sdfsdf " +e.getMessage());
//        }
//        try {
        int[] ints = new int[5];
        ints[4] = 1;
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }


//        MyDog myDog = new MyDog();
//        try {
//            myDog.walk();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        Dog dog = new Dog("Барсик");
        dog.putCollar();
        dog.putMuzzle();
//        dog.putLeash();
//        dog.walk();

        try {
            dog.walk();
            dog.test();
//            throw new Exception("Exception");
        } catch (DogIsNotReadyException exception) {
            System.out.println(exception.getMessage());
//            System.exit(1);
        } finally {
            System.out.println("finally");
        }

        try (InputStream inputStream = new FileInputStream("c://temp/1.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("c://temp/1.txt");
            int read = inputStream.read();
//            dog.test();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }


        String x = "z";
        try {
            x = "234";
        } finally {
            x = "Finally";
        }
        System.out.println(x);//Finally

    }
}
