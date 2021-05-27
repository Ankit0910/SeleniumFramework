package LogDemo;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {
	
	static Logger logger = LogManager.getLogger(Log4j.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");

		logger.info("this is ingo message");
		
		System.out.println("completed");
		
	}

}
