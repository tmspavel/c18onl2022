package com.tms.io.output;

import java.io.FileWriter;
import java.io.IOException;

public class TmsFileWriter implements TmsWriter {
    private final String filePath;

    public TmsFileWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String text) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
        }
    }

    @Override
    public void append(String text) throws IOException {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(text);
        }
    }
}
