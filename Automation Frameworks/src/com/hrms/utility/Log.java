package com.hrms.utility;

import org.apache.log4j.Logger;

public class Log {
// in static we don't need to create class name
	private static  Logger Log = Logger.getLogger(Log.class.getName());
public static void info (String message) {
	Log.info(message);
	}
	 
}
