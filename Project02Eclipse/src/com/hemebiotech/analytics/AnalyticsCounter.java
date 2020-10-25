package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {

    /*
     * main program
     * 
     */

    public static void main(String args[]) throws Exception {

	String filePath = args[0];
	String out = args[1];

	ISymptomReader reader = new ReadSymptomDataFromFile(filePath);
	List<Symptom> data = reader.read(reader);
	System.out.println(reader.GetSymptoms());

	ICounter counter = new SymptomsIterationCounter();
	List<SymptomRepeat> result1 = counter.count(data);

	ISorter sorter = new AlphabeticSymptomsSorter();
	List<SymptomRepeat> result2 = sorter.sort(result1);

	Writer writer = new SymptomsRepeatToFileWriter(out);
	writer.write(result2);

    }

}
