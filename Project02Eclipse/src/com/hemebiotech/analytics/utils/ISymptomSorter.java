
package com.hemebiotech.analytics.utils;

import java.util.Map;

/**
 * receives a map, it will be sorted alphabetically.
 * 
 * @author Eugene J
 * @version 1.0
 */
public interface ISymptomSorter {

    /**
     * 
     * Sort map in entry.
     *
     * @param data sort alphabetically
     * @return Returns the number of key-value mappings in this map.
     */
    Map<String, Long> sort(Map<String, Long> data);

}
