package com.thys.michels.codechef;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in), "UTF-8");
		scanner.nextLine();
		String[] fields = scanner.useDelimiter("\\A").next().trim().split("[\\r\\n]+");
		for (String field : fields){
			System.out.println(getNumberOfTrailingZeros(Integer.parseInt(field.trim()),getFactorFive(Integer.parseInt(field.trim()))));
		}
	}
	
	public static int getNumberOfTrailingZeros(int number, int factorfive){
		int trailingzeros = 0;
		for (int k= 1; k<=factorfive; k++)
			trailingzeros += Math.floor(number/Math.pow(5,k));
		return trailingzeros;
	}
	
	public static int getFactorFive(int number){
		int arg1 = 0;
		while (Math.pow(5, arg1) < number)
			arg1++;
		return arg1;
	}
}
