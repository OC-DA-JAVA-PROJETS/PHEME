
package com.hemebiotech.analytics.utils;

import java.io.IOException;
import java.util.Map;

/**
 * 
 * Write all result into a file destination.
 *
 * @author Eugene J.
 * @version 1.0
 */
public interface ISymptomWriter {

    /**
     * 
     * @param result2 is the final destination of the sorted map.
     * @throws IOException in case of write error
     */
    void write(Map<String, Long> result2) throws IOException;

}
