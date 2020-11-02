package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.utils.ISymptomCounter;
import com.hemebiotech.analytics.utils.ISymptomReader;
import com.hemebiotech.analytics.utils.ISymptomSorter;
import com.hemebiotech.analytics.utils.ISymptomWriter;
import com.hemebiotech.analytics.utils.impl.AlphabeticSymptomsSorterV2;
import com.hemebiotech.analytics.utils.impl.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.utils.impl.SymptomsIterationCounter;
import com.hemebiotech.analytics.utils.impl.SymptomsRepeatToFileWriter;

public class AnalyticsCounter {

    /*
     * main program
     * 
     */

    public static void main(String args[]) throws Exception {

	String filePath = args[0];
	String out = args[1];

	ISymptomReader reader = new ReadSymptomDataFromFile(filePath);
	ISymptomCounter counter = new SymptomsIterationCounter();
	ISymptomSorter sorter = new AlphabeticSymptomsSorterV2();
	ISymptomWriter writer = new SymptomsRepeatToFileWriter(out);

	List<String> data = reader.GetSymptoms();
	Map<String, Long> result1 = counter.count(data);
	Map<String, Long> result2 = sorter.sort(result1);
	writer.write(result2);

    }

}
