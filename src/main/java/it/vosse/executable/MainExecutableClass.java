package it.vosse.executable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainExecutableClass {

	final static Logger logger = LoggerFactory.getLogger(MainExecutableClass.class);
	
	public static void main(String[] args) {
	    logger.info("de executable jar is opgestart");
		
		for ( int i=0; i<10; i++) {
			logger.debug("in loop {}", i);
		}

		logger.info("einde");				
	}

}
