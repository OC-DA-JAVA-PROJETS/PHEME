package com.hemebiotech.analytics;

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

		String filePath = args[0];
		String out = args[1];

		ISymptomReader reader = new ReadSymptomDataFromFile(filePath);
		List<String> data = reader.GetSymptoms();
		System.out.println(reader.GetSymptoms());

		ISymptomCounter counter = new SymptomsIterationCounter();
		Map<String, Long> result1 = counter.count(data);

		ISymptomSorter sorter = new AlphabeticSymptomsSorter();
		Map<String, Long> result2 = sorter.sort(result1);

		ISymptomWriter writer = new SymptomsRepeatToFileWriter(out);
		writer.write(result2);

	}

}
