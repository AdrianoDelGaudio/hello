package hello;

import java.util.logging.Level;
import java.util.logging.Logger;

public class hello {
	public static void main(String[] args ) {
		Logger logger
				= Logger.getLogger(hello.class.getName());
			logger.log(Level.INFO, "hello world");
	}
}