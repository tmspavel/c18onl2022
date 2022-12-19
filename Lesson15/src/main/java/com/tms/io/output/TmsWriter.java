package com.tms.io.output;

import java.io.IOException;

public interface TmsWriter {
    /**
     * write text to the output
     */
    void write(String text) throws IOException;

    /**
     * append text to the end of the output
     */
    void append(String text) throws IOException;
}
