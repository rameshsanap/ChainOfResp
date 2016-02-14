package com.rsanap.designpattern;

public class Client {

	public static AbstractLogger getLoggerChain() {
		AbstractLogger errorLogger = new ErrorLogger(3);
		AbstractLogger fileLogger = new ErrorLogger(2);
		AbstractLogger consoleLogger = new ErrorLogger(1);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger logger = getLoggerChain();
//		logger.logMessage(3, "error logger message");
		logger.logMessage(2, "file logger message");
	}
}
