package task1;

import java.io.File;

import static java.util.Objects.nonNull;

public class Task1 {

    //    * 1) Список каталога
//     * Написать метод который циклически просматривает содержимое заданного каталога и выводит на
//    печать информацию о всех файлах и каталогах, находящихся в нем и в его подкаталогах.
//            * Используем рекурсию.
    public static void main(String[] args) {
        readFiles(new File("D:\\Study"));
    }

    public static void readFiles(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (nonNull(files)) {
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName() + " файл");
                    } else {
                        System.out.println(file.getName() + " каталог");
                        readFiles(file);
                    }
                }
            }
        }
    }
}
