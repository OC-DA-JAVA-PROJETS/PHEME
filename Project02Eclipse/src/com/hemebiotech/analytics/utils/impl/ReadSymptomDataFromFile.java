package com.hemebiotech.analytics.utils.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hemebiotech.analytics.utils.ISymptomReader;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private String filepath;

    /**
     * 
     * @param filepath a full or partial path to file with symptom strings in it,
     *                 one per line
     */
    public ReadSymptomDataFromFile(String filepath) {

	this.filepath = filepath;

    }

    @Override
    public List<String> GetSymptoms() {
	List<String> result = new ArrayList<String>();

	if (filepath != null) {
	    try {
		BufferedReader reader = new BufferedReader(new FileReader(filepath));
		String line = reader.readLine();

		while (line != null) {
		    result.add(line);
		    line = reader.readLine();
		}
		reader.close();
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}

	return result;
    }

}
