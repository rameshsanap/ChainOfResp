package com.rsanap.designpattern;

public abstract class AbstractLogger {

	protected int logLevel;
	private AbstractLogger nextLogger;
	
	public AbstractLogger(int logLevel){
		this.logLevel = logLevel;
	}
	
	public void setNextLogger(AbstractLogger abstractLogger){
		this.nextLogger = abstractLogger;
	}
	
	public void logMessage(int logLevel, String message){
		if(this.logLevel <= logLevel){
			writeMessage(message);
		}else if(nextLogger != null){
			nextLogger.logMessage(logLevel, message);
		}
	}
	
	protected abstract void writeMessage(String message);
}
