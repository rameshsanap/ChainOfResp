package com.rsanap.designpattern;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int logLevel) {
		super(logLevel);
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Console Log "+message);
	}

}
