package com.tms.io.input;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;

public class TmsInputStreamUrlReader implements TmsReader {
    private final String url;

    public TmsInputStreamUrlReader(String url) {
        this.url = url;
    }

    @Override
    public String readLine() {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte[] readAll() throws IOException {
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer)) != -1) {
                out.write(dataBuffer, 0, bytesRead);
            }
            return out.toByteArray();
        }
    }
}
