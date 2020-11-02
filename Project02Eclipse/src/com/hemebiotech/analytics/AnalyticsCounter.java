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

public class AnalyticsCounter {

    /*
     * main program
     * 
     */

    public static void main(String args[]) throws Exception {

	AnalyticsCounter processor = new AnalyticsCounter();

	processor.process(args[0], args[1]);

    }

    public void process(String filePath, String out) throws IOException {

	ISymptomReader reader = new ReadSymptomDataFromFile(filePath);
	ISymptomCounter counter = new SymptomsIterationCounter();
	ISymptomSorter sorter = new AlphabeticSymptomsSorter();
	ISymptomWriter writer = new SymptomsRepeatToFileWriter(out);

	List<String> data = reader.GetSymptoms();
	Map<String, Long> result1 = counter.count(data);
	Map<String, Long> result2 = sorter.sort(result1);
	writer.write(result2);

    }

}
