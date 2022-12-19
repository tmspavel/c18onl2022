package com.tms.io.input;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TmsScannerFileReader implements TmsReader {
    private final String inputFileName;
    private final Scanner scanner;
    private final InputStream stream;

    public TmsScannerFileReader(String inputFileName) throws IOException {
        this.inputFileName = inputFileName;
        stream = getClass().getClassLoader().getResourceAsStream(inputFileName);
        if (stream == null) {
            throw new FileNotFoundException();
        }
        scanner = new Scanner(stream);

//        List<String> stringList = FileUtils.readLines(new File(inputFileName), "UTF-8");
    }

    @Override
    public String readLine() throws IOException {
        if (scanner.hasNext()) {
            return scanner.nextLine();
        } else {
            stream.close();
        }
        return null;
    }

    @Override
    public byte[] readAll() throws IOException {
        StringBuilder sb = new StringBuilder();

        try (InputStream stream = getClass().getClassLoader().getResourceAsStream(inputFileName)) {
            Scanner scanner = new Scanner(stream);
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append("\n");
            }
        }
        return sb.toString().getBytes();
    }

    public Integer readInt() throws IOException {
        if (scanner.hasNext()) {
            return scanner.nextInt();
        } else {
            stream.close();
        }
        return null;
    }
}
