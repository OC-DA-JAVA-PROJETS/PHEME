/**
 * 
 */
package com.hemebiotech.analytics.utils;

import java.util.List;
import java.util.Map;

/**
 * TODO description
 *
 * @author Eugene
 * @version 1.0
 */
public interface ISymptomCounter {

	Map<String, Long> count(List<String> data);

}
