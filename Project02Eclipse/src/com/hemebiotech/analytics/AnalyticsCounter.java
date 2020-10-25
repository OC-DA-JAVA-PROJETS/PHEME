package com.hemebiotech.analytics;

public class AnalyticsCounter {

    /*
     * main program
     * 
     */

    public static void main(String args[]) throws Exception {

	String filePath = args[0];
	String out = args[1];

	ISymptomReader reader = new ReadSymptomDataFromFile(filePath);
	System.out.println(reader.GetSymptoms());

	Counter counter = new SymptomsIterationCounter();
	counter.count();

	Sorter sorte = new AlphabeticSymptomsSorter();
	sorter.sort();

	Writer writer = new SymptomsRepeatToFileWriter();
	writer.write();

    }
    // FIXME 8 Externalisé vers la classe WriteSymptomDataToFile
    // FIXME 9 : Externaliser le chemin du fichier via les arguments du programme.

    // FileWriter writer = new FileWriter("result.out");
    // FIXME 10 :Réglé par le FIXME 1.
    // FIXME 12 : Réglé par le FIXME 1.
//	writer.write("headache: " + headacheCount + "\n");
//	writer.write("rash: " + rashCount + "\n");
//	writer.write("dialated pupils: " + pupilCount + "\n");
//	writer.close();
}
