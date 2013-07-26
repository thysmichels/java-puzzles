package com.thys.michels.codechef;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class SmallFactorials {

	/**
	 * @param args
	 */
	public static int fact(int number){
		if (number == 1)
			return 1;
		return fact(number-1)*number;
	}
	
	public static void main(String[] args) {
		String data = "4\n 1\n2\n5\n3\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(new BufferedInputStream(System.in), "UTF-8");
		Integer testcase = Integer.parseInt(scanner.nextLine());
		String[] fields = scanner.useDelimiter("\\A").next().trim().split("[\\r\\n]+");
		for (int k = 0; k<testcase && testcase<=100 && testcase>=1; k++){
			if (Integer.parseInt(fields[k])>=1 && Integer.parseInt(fields[k])<=100)
				System.out.println(fact(Integer.parseInt(fields[k])));
		}
	}

}
