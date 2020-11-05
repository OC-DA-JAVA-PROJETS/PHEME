package com.hemebiotech.analytics.utils.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import com.hemebiotech.analytics.utils.ISymptomWriter;

/**
 * Writer program receive the final sequence of treatment
 * from{@linkAlphabeticSymptomsSorter} a treemap and write this result in
 * destination file.
 * 
 * @author Eugene J.
 * @version 1.0
 */
public class SymptomsRepeatToFileWriter implements ISymptomWriter {

    /** path of file to write **/
    String fileName;

    /**
     * Init a writer with a specific destination path.
     * 
     * @param fileName path of file to write.
     */
    public SymptomsRepeatToFileWriter(String fileName) {
	this.fileName = fileName;
    }

    /** {@inheritDoc} **/
    @Override
    public void write(Map<String, Long> data) throws IOException {
	FileWriter writer = new FileWriter(fileName);
	for (Entry<String, Long> item : data.entrySet()) {
	    String line = item.getKey() + ": " + item.getValue();
	    writer.append(line);
	    writer.append('\n');
	}
	writer.close();
    }

}
