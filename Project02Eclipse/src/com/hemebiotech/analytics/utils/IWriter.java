/**
 * 
 */
package com.hemebiotech.analytics.utils;

import java.io.IOException;
import java.util.List;

/**
 * TODO description
 *
 * @author Eugene
 * @version 1.0
 */
public interface IWriter {

	void write(List<String> data) throws IOException;

}
