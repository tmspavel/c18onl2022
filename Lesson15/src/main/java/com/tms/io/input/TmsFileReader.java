package com.tms.io.input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TmsFileReader implements TmsReader {
    private final String inputFilePath;
    private final FileReader reader;
    private boolean closed = false;

    public TmsFileReader(String inputFilePath) throws FileNotFoundException {
        this.inputFilePath = inputFilePath;
        reader = new FileReader(inputFilePath);
    }

    @Override
    public String readLine() throws IOException {
        if (closed) {
            return null;
        }
        int i;
        StringBuilder result = new StringBuilder();
        while ((i = reader.read()) != -1 && i != 10) {
            result.append((char) i);
        }
        if (i == -1) {
            reader.close();
            closed = true;
        }
        return result.toString();
    }

    @Override
    public byte[] readAll() throws IOException {
        try (FileReader fileReader = new FileReader(inputFilePath)) {
            int i;
            StringBuilder result = new StringBuilder();
            char[] buffer = new char[5];
            while ((i = fileReader.read(buffer)) > -1) {
                if (i < 5) {
                    buffer = Arrays.copyOf(buffer, i);
                }
                result.append(buffer);
            }
            return result.toString().getBytes();
        }
    }
}
