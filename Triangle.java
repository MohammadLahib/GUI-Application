

public class Triangle implements ITriangle {
	



    public String computeType(String s1, String s2, String s3) {
    	   
    	String result = "";
    	
    	
        try {
        	
        	double st1 =  Double.parseDouble(s1);
        	double st2 =  Double.parseDouble(s2);
        	double st3 = Double.parseDouble(s3);

        	
        	if (st1 <= 0 || st2 <= 0 || st3 <= 0 || (st1 + st2 < st3 || st2 + st3 < st1 || st1 + st3 < st2)) {
        		throw new Exception("Uncorrect_Error");		
        	}
        	
            if (st1 == st2 && st1 == st3){
                result =  "Equilateral";
            }else if (st1 != st2 && st2 != st3 && st1 != st3){
                result = "Scalene";
            }else if (st1 == st2 || st1 == st3 || st2 == st3){
                result = "Isosceles";
            }
            
        } catch (Exception e) {
           return "Uncorrect_Error";
        }
		return result;
    }
 
}

