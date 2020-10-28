/**
 * 
 */
package com.hemebiotech.analytics.utils.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import com.hemebiotech.analytics.utils.ISymptomWriter;

/**
 * TODO description
 *
 * @author Eugene
 * @version 1.0
 */
public class SymptomsRepeatToFileWriter implements ISymptomWriter {
	
	String fileName;

    /**
     * @param out
     * @throws IOException
     */
    public SymptomsRepeatToFileWriter(String out) throws IOException {
    	fileName = out;
    }

	@Override
	public void write(Map<String, Long> data) throws IOException {
		FileWriter writer = new FileWriter(fileName);
		for (Entry<String, Long> item : data.entrySet()) {
			String line = item.getKey() + ": " + item.getValue();
			writer.append(line);
			writer.append('\n'); // retour de ligne
		}
		writer.close();
	}

}
