package com.thys.michels.codechef;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorials {
	public static BigInteger fact(BigInteger n){
		 BigInteger result = BigInteger.ONE;
		 while (!n.equals(BigInteger.ZERO)) {
		     result = result.multiply(n);
		     n = n.subtract(BigInteger.ONE);
		 }
		 return result;
	}
	
	public static void main(String[] args) {
		//String data = "6\n 1\n2\n5\n3\n99\n100\n";
		//System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(new BufferedInputStream(System.in), "UTF-8");
		Integer testcase = Integer.parseInt(scanner.nextLine());
		String[] fields = scanner.useDelimiter("\\A").next().trim().split("[\\r\\n]+");
		for (int k = 0; k<testcase && testcase<=100 && testcase>=1; k++){
			if (Integer.parseInt(fields[k])>=1 && Integer.parseInt(fields[k])<=100)
				System.out.println(fact(BigInteger.valueOf(Long.parseLong(fields[k]))));
		}
	}
}
