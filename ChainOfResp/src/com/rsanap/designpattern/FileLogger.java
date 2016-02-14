package com.rsanap.designpattern;

public class FileLogger extends AbstractLogger {

	public FileLogger(int logLevel) {
		super(logLevel);
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("File Logger " + message);
	}

}
