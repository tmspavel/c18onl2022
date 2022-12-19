package com.tms.io.input;

import java.io.IOException;

public interface TmsReader {
    /**
     * @return null if there is nothing more to read
     */
    String readLine() throws IOException;

    byte[] readAll() throws IOException;
}
