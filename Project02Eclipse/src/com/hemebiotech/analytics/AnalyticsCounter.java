package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;

public class AnalyticsCounter {

    /*
     * main program
     * 
     */

    public static void main(String args[]) throws Exception {

	String filePath = args[0];
	String out = args[1];

	BufferedReader reader = new BufferedReader(new FileReader(filePath));
	String line = reader.readLine();

	// FIXME 7 : Externalisé vers la classe ReadSymptomDataFromFile
	while (line != null) {
	    // FIXME 6 : Réglé par le FIXME 1
	    System.out.println("symptom from file: " + line);

	    line = reader.readLine();

	}

	reader.close();

	// FIXME 8 Externalisé vers la classe WriteSymptomDataToFile
    }

    // FIXME 9 : Externaliser le chemin du fichier via les arguments du programme.

    // FileWriter writer = new FileWriter("result.out");
    // FIXME 10 :Réglé par le FIXME 1.
    // FIXME 12 : Réglé par le FIXME 1.
//	writer.write("headache: " + headacheCount + "\n");
//	writer.write("rash: " + rashCount + "\n");
//	writer.write("dialated pupils: " + pupilCount + "\n");
//	writer.close();
}
