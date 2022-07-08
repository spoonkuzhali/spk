package NewUser;

import java.io.IOException;

public class ThrowAndThrows {
	
	public void Throw(int num) { 
		try {
	     if(num==1) 
		        throw new IOException("IOException Occurred");
		     else
		        throw new ArithmeticException("ArithmeticException");
		  } 
	     catch(IOException ex){
		     System.out.println(ex);
		    } 

	}
	
	    //declare exception using throws in the method signature
		
		  	
		   
		}

		}
		
		
	
