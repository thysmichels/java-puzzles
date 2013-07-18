package com.thys.michels.codechef;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) throws java.lang.Exception {
    	Scanner scanner = new Scanner(new BufferedInputStream(System.in), "UTF-8");
		String[] fields = scanner.useDelimiter("\\A").next().trim().split("[\\r\\n]+");
		 for (String field : fields){
		    	if ((Double.valueOf(field.trim().split("\\s+")[0]) > 0 && Double.valueOf(field.trim().split("\\s+")[0]) <= 2000) && (Double.valueOf(field.trim().split("\\s+")[1]) > 0 && Double.valueOf(field.trim().split("\\s+")[1]) <= 2000) ){
		    		
		    		if (Double.valueOf(field.trim().split("\\s+")[0])%5 == 0 && ((Double.valueOf(field.trim().split("\\s+")[0])+Double.valueOf(0.5))<=Double.valueOf(field.trim().split("\\s+")[1])))
		    			System.out.println(String.format("%.2f", Double.valueOf(field.trim().split("\\s+")[1]) - Double.valueOf(field.trim().split("\\s+")[0]) - 0.5));
		    		else
		    			System.out.println(String.format("%.2f",Double.valueOf(field.trim().split("\\s+")[1])));
		    	}
		  }
	}
}

