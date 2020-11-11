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

    /** processing reader **/
    private ISymptomReader reader;
    /** processing counter **/
    private ISymptomCounter counter;
    /** processing sorter **/
    private ISymptomSorter sorter;
    /** processing writer **/
    private ISymptomWriter writer;

    /**
     * 
     * Constructor of {@link AnalyticsCounter}.<br>
     * This constructor allows to specify reader, counter, sorter writer to be used
     * by the generated object.
     * 
     * @param reader  reader à utiliser
     * @param counter counter à utiliser
     * @param sorter  sorter à utiliser
     * @param writer  writer à utiliser
     */
    public AnalyticsCounter(
	    ISymptomReader reader, ISymptomCounter counter, ISymptomSorter sorter, ISymptomWriter writer
    ) {
	this.reader = reader;
	this.counter = counter;
	this.sorter = sorter;
	this.writer = writer;
    }

    /**
     * Method used to launch analytics counter process
     * 
     * @throws IOException thrown by a read or write error on source or destination
     *                     file
     */
    public void process() throws IOException {
	List<String> symptoms;
	symptoms = reader.read();
	Map<String, Long> symptomsCounted = counter.count(symptoms);
	Map<String, Long> symptomsCountedAndSorted = sorter.sort(symptomsCounted);
	writer.write(symptomsCountedAndSorted);
    }

    /**
     * Launcher of {@link AnalyticsCounter}.
     * 
     * @param args is inecjtion of datas and destination of result
     */
    public static void main(String args[]) {
	ISymptomReader reader = new SymptomDataFromFileReader(args[0]);
	ISymptomCounter counter = new SymptomsNameCounter();
	ISymptomSorter sorter = new SymptomsAlphabeticSorter();
	ISymptomWriter writer = new SymptomsRepeatToFileWriter(args[1]);
	AnalyticsCounter processor = new AnalyticsCounter(reader, counter, sorter, writer);
	try {
	    processor.process();
	} catch (IOException e) {
	    System.err.println("Error in read or write");
	    e.printStackTrace();
	    System.exit(1);
	}
	System.exit(0);
    }

}
