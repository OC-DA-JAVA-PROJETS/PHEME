package com.hemebiotech.analytics.utils.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.utils.ISymptomCounter;

/**
 * Counter program sort the sequence itération from
 * {@link ReadSymptomDataFromFile} file source and stock the result into a
 * hasmap.
 * 
 * @author Eugene J.
 * @version 1.0
 */
public class SymptomsIterationCounter implements ISymptomCounter {

    /**
     * Count the quantity of each symptom and stock the result into a map.
     * 
     */
    @Override
    public Map<String, Long> count(List<String> data) {
	Map<String, Long> result;

	result = new HashMap<>();
	for (String item : data) {
	    Boolean alreadyExist = result.containsKey(item);
	    if (alreadyExist) {
		result.put(item, result.get(item) + 1);
	    } else {
		result.put(item, 1L);
	    }
	}

	return result;
    }

}
