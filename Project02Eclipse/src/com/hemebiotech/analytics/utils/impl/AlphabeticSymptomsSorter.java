
package com.hemebiotech.analytics.utils.impl;

import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.analytics.utils.ISymptomSorter;

/**
 * Alphabetic program sort the map of sequence iteration from
 * {@link SymptomsIterationCounter} into à treemap of keys and values in
 * alphabetical order.
 * 
 * @author Eugene J.
 * @version 1.0
 */
public class AlphabeticSymptomsSorter implements ISymptomSorter {

    /** {@inheritDoc} **/
    @Override
    public Map<String, Long> sort(Map<String, Long> data) {
	Map<String, Long> result;
	result = new TreeMap<String, Long>(data);
	return result;
    }

}
