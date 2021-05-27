package LogDemo;

import java.io.IOException;

public class ExceptionalHandlingDemo {

	public static void main(String[] args) {

		
		try {
	System.out.println("start");
	throw new IOException();
	//System.out.println("end");
		}
		catch (Exception exp) {
			
			 System.out.println("Message is "+exp.getMessage());
			 System.out.println("Cause is"+exp.getCause());
			 exp.printStackTrace();
			 }
		finally {
			System.out.println("finally end, u _ _ _ _ _");
		}

	}

}
