package com.thys.michels.hackerrank;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Leibniz {
	public static void main(String[] args) {
		/*String data = "2\n 10\n 20\n";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		System.setIn(stdin);
		String[] fields = scanner.useDelimiter("\\A").next().trim().split("[\\r\\n]+");*/
		
		Scanner scanner = new Scanner(new BufferedInputStream(System.in), "UTF-8");
		scanner.nextLine();
		String[] fields = scanner.useDelimiter("\\A").next().trim().split("[\\r\\n]+");
		for (String field : fields){
		double calcLeibniz = 1;
		for (double k = 3, pos = 2; k <= Double.valueOf(field)*2; k+=2, pos++)
		{
			calcLeibniz -= Math.pow(-1, pos)/(k);
		}
		System.out.println(String.format("%.15f", calcLeibniz));
		}
	}
}
