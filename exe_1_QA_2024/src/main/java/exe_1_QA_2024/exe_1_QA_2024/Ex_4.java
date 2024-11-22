package exe_1_QA_2024.exe_1_QA_2024;

public class Ex_4 {

	public static String Compare(double a, double b, String mod) {
		
		switch(mod) {
		  
		case "regulars":
			  
		    if (a < b)
		    	return "B";
		    
		    else if(a>b)
		    	return "A";
		    
		    else
		    	return "Error";
		
		  case "negatives":
			  if(-a < -b)
				  return "B";
			  
			  else if(-a > -b)
			    	return "A";
			
			  else
				  return "Error";
		 
		  case "reciprocals":
			  
			  if(a==0 || b==0 ) {
				 return("Division by zero is not allowed");
			  }
			  
			  else if((1/a) < (1/b))
				  return "B";
			  
			  else
				  return "A";
	
			    
		  default:
			  throw new IllegalArgumentException("Invalid 	mode");

		}

		// assertEquals("Divide by zero gives infinity as result",
		//true, Double.isInfinite(resultDiv));
	}
		
}
