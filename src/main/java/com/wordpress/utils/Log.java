package com.wordpress.utils;

import org.apache.log4j.Logger;

/*
 * Class : Log class 
 * Description: Log class contains to log the start, end of Test Case, Info, warn, fatel, debug of Test case methods
 * Date Created: 5-May-2020
 * Author: Ravichandra Kammara
 */

public class Log {

//Initialize Log4j logs

	private static Logger Log = Logger.getLogger(Log.class.getName());

   // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite

	public static void startTestCase(String sTestCaseName) {

		Log.info(" Start of " + sTestCaseName + " Test Case");

	}

	// This is to print log for the ending of the test case

	public static void endTestCase(String sTestCaseName) {

		Log.info("" + "-E---N---D-" + "" +sTestCaseName+ " Test Case ");

	}

	public static void info(String message) {

		Log.info(message);

	}

	public static void warn(String message) {

		Log.warn(message);

	}

	public static void error(String message) {

		Log.error(message);

	}

	public static void fatal(String message) {

		Log.fatal(message);

	}

	public static void debug(String message) {

		Log.debug(message);

	}

}