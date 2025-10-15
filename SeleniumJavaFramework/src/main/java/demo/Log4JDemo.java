package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
	
	static Logger logger=LogManager.getLogger(Log4JDemo.class);

	public static void main(String[] args) 
	{
		
		
		System.out.println("\n  Hello World...!   \n");
		
		logger.trace("This is trace message ");
		logger.info("This is information message ");
		logger.error("This is Error message ");
		logger.warn("This is Warning message ");
		logger.fatal("this is a fatal message ");
		System.out.println("\n Completed ");

	}

}
