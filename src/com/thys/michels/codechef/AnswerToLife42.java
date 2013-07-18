package com.thys.michels.codechef;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnswerToLife42 {
	private static String charsetName = "UTF-8";
	public static void main(String[] args) throws java.lang.Exception {
    	Scanner scanner = new Scanner(new BufferedInputStream(System.in), charsetName);
		String[] fields = scanner.useDelimiter("\\A").next().trim().split("\\s+");
	    List<Integer> vals = new ArrayList<Integer>();
	    for (String field : fields){
	    	if (field.equalsIgnoreCase("42"))
	    		break;
	    	else
	    		vals.add( Integer.parseInt(field));
	    }
		for (Integer output : vals){
			System.out.println(output);
		}
	}
}
