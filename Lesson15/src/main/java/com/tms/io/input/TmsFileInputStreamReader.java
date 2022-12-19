package com.tms.io.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TmsFileInputStreamReader implements TmsReader {
    private final String inputFilePath;
    private final FileInputStream stream;
    private boolean closed = false;

    public TmsFileInputStreamReader(String inputFilePath) throws FileNotFoundException {
        this.inputFilePath = inputFilePath;
        stream = new FileInputStream(inputFilePath);
    }

    @Override
    public String readLine() throws IOException {
        if (closed) {
            return null;
        }
        int i;
        StringBuilder result = new StringBuilder();
        while ((i = stream.read()) != -1 && i != 10) {
            result.append((char) i);
        }
        if (i == -1) {
            stream.close();
            closed = true;
        }
        return result.toString();
    }

    @Override
    public byte[] readAll() throws IOException {
        try (FileInputStream stream = new FileInputStream(inputFilePath)) {
//            asdads
//            the same thing
//            return stream.readAllBytes();
            byte[] buffer = new byte[stream.available()];
            stream.read(buffer);
            return buffer;
        }
    }
}
