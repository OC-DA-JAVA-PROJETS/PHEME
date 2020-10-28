/**
 * 
 */
package com.hemebiotech.analytics.utils;

import java.io.IOException;
import java.util.Map;

/**
 * TODO description
 *
 * @author Eugene
 * @version 1.0
 */
public interface ISymptomWriter {

	void write(Map<String, Long> result2) throws IOException;

}
