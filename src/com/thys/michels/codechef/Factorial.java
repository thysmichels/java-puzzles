package com.thys.michels.codechef;

import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in), "UTF-8");
		String[] fields = scanner.useDelimiter("\\A").next().trim().split("[\\r\\n]+");
		for (String field : fields){
			System.out.println(countZeros(Integer.parseInt(field.trim())));
		}
	}
	public static BigInteger factorial(int number) {
		BigInteger ans = new BigInteger("1");
		while (number > 0) {
			ans = ans.multiply(new BigInteger(Integer.toString(number)));
			number -= 1;
		}
		return ans;
	}
	public static int countZeros(int number) {
		final BigInteger zero = new BigInteger("0");
		final BigInteger ten = new BigInteger("10");
		BigInteger fact = factorial(number);
		int zeroCount = 0;
		while (fact.mod(ten).compareTo(zero) == 0){
			fact = fact.divide(ten);
			zeroCount += 1;
		}
		return zeroCount;
	}
}
