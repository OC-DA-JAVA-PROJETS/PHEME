package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
    // FIXME 1 : Suppression des variables statiques, à remplacer par une liste de
    // compteur de symptomes
    private static int headacheCount = 0; // initialize to 0
    private static int rashCount = 0; // initialize to 0
    private static int pupilCount = 0; // initialize to 0

    public static void main(String args[]) throws Exception {
	// FIXME 2 :Chemin de fichier non paramétrable
	// first get input
	BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
	String line = reader.readLine();

	// FIXME 3 : A supprimer.
	int i = 0; // set i to 0
	// FIXME 4 : Réglé par le FIXME 1.
	int headCount = 0; // counts headaches
	// FIXME 7 : Externalisé vers la classe ReadSymptomDataFromFile
	while (line != null) {
	    i++; // increment i

	    // FIXME 6 : Réglé par le FIXME 1
	    System.out.println("symptom from file: " + line);
	    if (line.equals("headache")) {
		headCount++;
		// FIXME 5 : A supprimer.
		// FIXME 13 : Réglé par le FIXME 1.
		System.out.println("number of headaches: " + headCount);
	    } else if (line.equals("rush")) {
		rashCount++;
	    } else if (line.contains("pupils")) {
		pupilCount++;
	    }

	    line = reader.readLine(); // get another symptom

	    // FIXME 11 :Fermeture de la boucle.

	    // FIXME 8 Externalisé vers la classe WriteSymptomDataToFile
	}

	// FIXME 9 : Externaliser le chemin du fichier via les arguments du programme.

	// next generate output
	FileWriter writer = new FileWriter("result.out");
	// FIXME 10 :Réglé par le FIXME 1.
	// FIXME 12 : Réglé par le FIXME 1.
	writer.write("headache: " + headacheCount + "\n");
	writer.write("rash: " + rashCount + "\n");
	writer.write("dialated pupils: " + pupilCount + "\n");
	writer.close();
    }
}
