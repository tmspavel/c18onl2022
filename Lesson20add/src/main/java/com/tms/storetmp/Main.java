package com.tms.storetmp;

import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        readCatalog(new File("/Users/pavel/0"));

    }

    public static void readCatalog(File directory) {
        if (directory.exists()) {
            File[] files = directory.listFiles();
            if (Objects.nonNull(files)) {
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file + file.getName());
                    } else {
                        readCatalog(file);
                    }
                }
            }
        } else {
            System.out.println("Директория не найдена");
        }
    }
}
