package com.tms.io.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class TmsFileOutputStreamWriter implements TmsWriter {
    private final String filePath;

    public TmsFileOutputStreamWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String text) throws IOException {
        try (FileOutputStream stream = new FileOutputStream(filePath)) {
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//            byteArrayOutputStream.write(text.getBytes());
//            byteArrayOutputStream.writeTo(stream);
            stream.write(text.getBytes());
        }
    }

    @Override
    public void append(String text) throws IOException {
        try (FileOutputStream stream = new FileOutputStream(filePath, true)) {
            stream.write(text.getBytes());
            stream.flush();
        }
    }
}
