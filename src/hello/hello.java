package hello;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hello {
	public static void main(String[] args ) {
		Logger logger
				= Logger.getLogger(Hello.class.getName());
			logger.log(Level.INFO, "hello world");
	}
}