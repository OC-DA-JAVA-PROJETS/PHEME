
package com.hemebiotech.analytics.utils.impl;

import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.analytics.utils.ISymptomSorter;

/**
 *
 * @author Eugene
 * @version 1.0
 */
public class AlphabeticSymptomsSorterV2 implements ISymptomSorter {

    @Override
    public Map<String, Long> sort(Map<String, Long> data) {
	Map<String, Long> result;
	result = new TreeMap<String, Long>(data);
	return result;
    }

}
