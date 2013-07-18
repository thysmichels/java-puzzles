package com.thys.michels.codechef;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		String data = "3\n 60 \n";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		System.setIn(stdin);
		//Scanner scanner = new Scanner(new BufferedInputStream(System.in), "UTF-8");
		String[] fields = scanner.useDelimiter("\\A").next().trim().split("[\\r\\n]+");
		BigInteger n = BigInteger.ONE;
        
		for (String field : fields){
			for (int i=1; i<=Double.valueOf(field); i++) {
	            n = n.multiply(BigInteger.valueOf(i));
	        }
		}
	}
}
