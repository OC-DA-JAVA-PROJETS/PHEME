package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.utils.ISymptomCounter;
import com.hemebiotech.analytics.utils.ISymptomReader;
import com.hemebiotech.analytics.utils.ISymptomSorter;
import com.hemebiotech.analytics.utils.ISymptomWriter;
import com.hemebiotech.analytics.utils.impl.AlphabeticSymptomsSorter;
import com.hemebiotech.analytics.utils.impl.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.utils.impl.SymptomsIterationCounter;
import com.hemebiotech.analytics.utils.impl.SymptomsRepeatToFileWriter;

/**
 * Analytic program that takes a symptoms source, counts occurence of each
 * symptom, sorts result by alphabatical order and writes result into a
 * destination.
 * 
 * @author Eugene J.
 * @version 1.0
 */
public class AnalyticsCounter {

    /**
     * Launcher of {@link AnalyticsCounter}.
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {
	AnalyticsCounter processor = new AnalyticsCounter();
	processor.process(args[0], args[1]);
    }

    /**
     * Method used to launch analytics counter process
     * 
     * @param sourceFile      path of source file
     * @param destinationFile path of destination file
     * @throws IOException thrown by a read or write error on source or destination
     *                     file
     */
    public void process(String sourceFile, String destinationFile) throws IOException {
	ISymptomReader reader = new ReadSymptomDataFromFile(sourceFile);
	ISymptomCounter counter = new SymptomsIterationCounter();
	ISymptomSorter sorter = new AlphabeticSymptomsSorter();
	ISymptomWriter writer = new SymptomsRepeatToFileWriter(destinationFile);
	List<String> data = reader.read();
	Map<String, Long> result1 = counter.count(data);
	Map<String, Long> result2 = sorter.sort(result1);
	writer.write(result2);
    }

}
