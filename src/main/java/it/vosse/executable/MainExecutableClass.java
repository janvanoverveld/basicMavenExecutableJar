package it.vosse.executable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MainExecutableClass {

	final static Logger logger = LoggerFactory.getLogger(MainExecutableClass.class);
	
	static int maxIteration = 100;
	
	private static int getIterations() {
		int maxIter = 0;
	    try (InputStream input = MainExecutableClass.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return maxIter;
            }
            prop.load(input);
            maxIter = Integer.valueOf(prop.getProperty("maximumIterations"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }	    
		return maxIter;
	}
	
	public static void main(String[] args) {
	    logger.info("de executable jar is opgestart");
			    	    
	    int maxIterations = MainExecutableClass.getIterations();
		for ( int i=0; i<maxIterations; i++) {
			logger.debug("in loop {}", i);
		}

		logger.info("einde");				
	}

}
