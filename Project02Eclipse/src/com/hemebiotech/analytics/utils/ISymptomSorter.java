
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
     */
    Map<String, Long> sort(Map<String, Long> data);

}
