package com.hemebiotech.analytics.utils.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hemebiotech.analytics.utils.ISymptomReader;

/**
 * Reader program used to input source file containing a list of symptoms and
 * their repetition.
 * 
 * @author Eugene J.
 * @version 1.0
 */
public class SymptomDataFromFileReader implements ISymptomReader {

    /** path of file to read **/
    private String filePath;

    /**
     * Init a reader with a specific destination path.
     * 
     * @param filePath path of file to read.
     */
    public SymptomDataFromFileReader(String filePath) {

	this.filePath = filePath;
    }

    /** {@inheritDoc} **/
    @Override
    public List<String> read() throws IOException {
	List<String> result = new ArrayList<>();

	if (filePath != null) {
	    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
		String line = reader.readLine();
		while (line != null) {
		    result.add(line);
		    line = reader.readLine();
		}
		reader.close();

	    }
	}
	return result;
    }

}
