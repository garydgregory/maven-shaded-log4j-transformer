package io.github.edwgiz.log4j.maven.plugins.shade.transformer;


import org.apache.commons.io.output.ProxyOutputStream;

import java.io.IOException;
import java.io.OutputStream;

import static org.apache.commons.io.output.ClosedOutputStream.CLOSED_OUTPUT_STREAM;

final class CloseShieldOutputStream extends ProxyOutputStream {

    /* default */ CloseShieldOutputStream(final OutputStream out) {
        super(out);
    }


    @Override
    public void close() throws IOException {
        out.flush();
        out = CLOSED_OUTPUT_STREAM;
    }
}
