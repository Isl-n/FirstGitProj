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
			  if((1/a) < (1/b))
				  return "B";
			  
			  else if(1/a > 1/b)
			    	return "A";
			
			  else
				  return "Error";
			  
			  
		  default:
			  return "None";

		}

	}
		
}
