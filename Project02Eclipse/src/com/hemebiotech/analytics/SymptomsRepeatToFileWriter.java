/**
 * 
 */
package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

/**
 * TODO description
 *
 * @author Eugene
 * @version 1.0
 */
public class SymptomsRepeatToFileWriter implements Iwriter {

    /**
     * @param out
     * @throws IOException
     */
    public SymptomsRepeatToFileWriter(String out) throws IOException {

	FileWriter writer = new FileWriter("result.out");

	writer.close();
    }

}
