
package com.hemebiotech.analytics.utils;

import java.util.List;
import java.util.Map;

/**
 * All the lists of strings must be stored in a map of type keys and values.
 * Each value will need to be incremented if the key already exists.
 * 
 * @author Eugene J.
 * @version 1.0
 */
public interface ISymptomCounter {

    /**
     * counts the number of repetitions of a symptom contained in a list.
     * 
     * @param data Returns the number of elements in this list.
     * @return count Returns the number of key-value mappings in this map.
     */
    Map<String, Long> count(List<String> data);

}
