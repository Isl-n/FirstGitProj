package exe_1_QA_2024.exe_1_QA_2024;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Unit test for simple App.
 */

public class AppTest {

    /**
     * Rigorous Test :-)
     */
	
	Ex_4 tester= new Ex_4();
	
	 @Test
	    public void Test_1_1() {
	    	String ExpectedResult= "A";
	    	float a= 19, b= 13;
	    	String mode= "regulars";
	    	String actualResult= tester.Compare(a, b, mode);
	    	assertEquals(ExpectedResult,actualResult);
	    }
	 
	 @Test
	    public void Test_1_2() {
	    	String ExpectedResult= "B";
	    	float a= 1, b= 100;
	    	String mode= "regulars";
	    	String actualResult= tester.Compare(a, b, mode);
	    	assertEquals(ExpectedResult,actualResult);
	    }
	 
	 @Test
	    public void Test_1_3() {
	    	String ExpectedResult= "Error";
	    	float a= -99, b= -99;
	    	String mode= "regulars";
	    	String actualResult= tester.Compare(a, b, mode);
	    	assertEquals(ExpectedResult,actualResult);
	    }
	 
	 
	 @Test
	    public void Test_2_1() {
	    	String ExpectedResult= "B";
	    	float a=3, b=2;
	    	String mode= "negatives";
	    	String actualResult= tester.Compare(a, b, mode);
	    	assertEquals(ExpectedResult,actualResult);
	    }
	 
	 @Test
	    public void Test_2_2() {
	    	String ExpectedResult= "A";
	    	float a= 1, b= 22;
	    	String mode= "negatives";
	    	String actualResult= tester.Compare(a, b, mode);
	    	assertEquals(ExpectedResult,actualResult);
	    }
	 
	 @Test
	    public void Test_2_3() {
	    	String ExpectedResult= "Error";
	    	float a=-2, b=-2;
	    	String mode= "negatives";
	    	String actualResult= tester.Compare(a, b, mode);
	    	assertEquals(ExpectedResult,actualResult);
	    }
	 
	 @Test
	    public void Test_3_1() {
	    	String ExpectedResult= "B";
	    	float a=12, b=3;
	    	String mode= "reciprocals";
	    	String actualResult= tester.Compare(a, b, mode);
	    	assertEquals(ExpectedResult,actualResult);	
	    }
 
	 @Test
	    public void Test_3_2() {
	    	String ExpectedResult= "B";
	    	float a=6, b=1;
	    	String mode= "reciprocals";
	    	String actualResult= tester.Compare(a, b, mode);
	    	assertEquals(ExpectedResult,actualResult);	
	    }
	 
	 @Test
	    public void Test_3_3() {
	    	String ExpectedResult= "Error";
	    	float a=0, b=-9;
	    	String mode= "reciprocals";
	    	String actualResult= tester.Compare(a, b, mode);
	    	assertEquals(ExpectedResult,actualResult);	
	    }
    
    
    
    
}
