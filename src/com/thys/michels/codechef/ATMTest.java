package com.thys.michels.codechef;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class ATMTest {


	@Test
	public void test() {
		String data = "4.5 5 \n 5 5.5 \n 5 5 \n 3.99 4.5\n 5.0 5.49 \n 5.0 5.51 \n";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		System.setIn(stdin);
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
