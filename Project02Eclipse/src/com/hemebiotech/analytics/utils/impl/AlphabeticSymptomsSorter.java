/**
 * 
 */
package com.hemebiotech.analytics.utils.impl;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.hemebiotech.analytics.utils.ISymptomSorter;

/**
 * TODO description
 *
 * @author Eugene
 * @version 1.0
 */
public class AlphabeticSymptomsSorter implements ISymptomSorter {

	@Override
	public Map<String, Long> sort(Map<String, Long> data) {
		Map<String, Long> result;
		
		// TODO Auto-generated method stub
		result = new TreeMap<String, Long>();
		for (Entry<String, Long> item : data.entrySet()) {
			result.put(item.getKey(), item.getValue());
		}
		
		return result;
	}

}
