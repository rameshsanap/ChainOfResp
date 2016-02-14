package com.rsanap.designpattern;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int logLevel) {
		super(logLevel);
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Error Logger " + message);

	}

}
