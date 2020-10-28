/**
 * 
 */
package com.hemebiotech.analytics.utils.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.hemebiotech.analytics.utils.IWriter;

/**
 * TODO description
 *
 * @author Eugene
 * @version 1.0
 */
public class SymptomsRepeatToFileWriter implements IWriter {
	
	String fileName;

    /**
     * @param out
     * @throws IOException
     */
    public SymptomsRepeatToFileWriter(String out) throws IOException {
    	fileName = out;
    }

	@Override
	public void write(List<String> data) throws IOException {
//		FileWriter writer = new FileWriter(out);
		FileWriter writer = new FileWriter("result.out");
		// TODO la phase d'écriture
		writer.close();
	}

}
