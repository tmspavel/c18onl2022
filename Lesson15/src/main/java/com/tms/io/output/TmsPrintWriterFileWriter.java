package com.tms.io.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TmsPrintWriterFileWriter implements TmsWriter {
    private final String outputFilePath;

    public TmsPrintWriterFileWriter(String outputFilePath) {
        this.outputFilePath = outputFilePath;
    }


    @Override
    public void write(String text) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(outputFilePath))) {
            writer.print(text);
        }
    }

    @Override
    public void append(String text) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(outputFilePath, true))) {
            writer.append(text);
        }
    }
}
