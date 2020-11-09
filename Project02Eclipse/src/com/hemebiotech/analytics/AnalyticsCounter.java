package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.utils.ISymptomCounter;
import com.hemebiotech.analytics.utils.ISymptomReader;
import com.hemebiotech.analytics.utils.ISymptomSorter;
import com.hemebiotech.analytics.utils.ISymptomWriter;
import com.hemebiotech.analytics.utils.impl.SymptomDataFromFileReader;
import com.hemebiotech.analytics.utils.impl.SymptomsAlphabeticSorter;
import com.hemebiotech.analytics.utils.impl.SymptomsNameCounter;
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
     * Field of parameters
     * 
     */
    private ISymptomReader reader;
    private ISymptomCounter counter;
    private ISymptomSorter sorter;
    private ISymptomWriter writer;

    /**
     * 
     * Constructor
     * 
     * @param reader
     * @param counter
     * @param sorter
     * @param writer
     */
    public AnalyticsCounter(ISymptomReader reader, ISymptomCounter counter, ISymptomSorter sorter,
	    ISymptomWriter writer) {

	this.reader = reader;
	this.counter = counter;
	this.sorter = sorter;
	this.writer = writer;

    }

    /**
     * Method used to launch analytics counter process
     * 
     * @param sourceFile      path of source file
     * @param destinationFile path of destination file
     * @throws IOException thrown by a read or write error on source or destination
     *                     file
     */
    public void process() throws IOException {

	List<String> data = reader.read();
	Map<String, Long> result1 = counter.count(data);
	Map<String, Long> result2 = sorter.sort(result1);
	writer.write(result2);
    }

    /**
     * Launcher of {@link AnalyticsCounter}.
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {
	ISymptomReader reader = new SymptomDataFromFileReader(args[0]);
	ISymptomCounter counter = new SymptomsNameCounter();
	ISymptomSorter sorter = new SymptomsAlphabeticSorter();
	ISymptomWriter writer = new SymptomsRepeatToFileWriter(args[1]);
	AnalyticsCounter processor = new AnalyticsCounter(reader, counter, sorter, writer);
	processor.process();
    }

}
