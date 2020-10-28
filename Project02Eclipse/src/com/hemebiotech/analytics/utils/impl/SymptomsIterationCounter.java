/**
 * 
 */
package com.hemebiotech.analytics.utils.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.utils.ISymptomCounter;

/**
 * TODO description
 *
 * @author Eugene
 * @version 1.0
 */
public class SymptomsIterationCounter implements ISymptomCounter {

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
