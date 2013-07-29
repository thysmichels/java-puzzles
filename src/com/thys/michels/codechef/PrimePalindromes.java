package com.thys.michels.codechef;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class PrimePalindromes {

	private static int counter;
	private static long[] listOfPalindromes;

	public static long[] generatePalindromes(long number)
	{
		return null;
	}
	
	public static boolean isPalindrome(long number) {
	    long original = number;
	    long reverse = 0;
	    while (number > 0) {
	        long remain = number%10;
	        number = number/10;
	        reverse = reverse*10+remain;
	    }
	    return reverse == original;
	}
	
	public static boolean isPrime(long number)
	{
		for (int divisor = 2; divisor <= number / 2; divisor++){
			if (number % divisor == 0) 
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//String data = "99000\n";
		//System.setIn(new ByteArrayInputStream(data.getBytes()));
		java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader (System.in));
		long palindromeVal = Long.parseLong(r.readLine());
		if (palindromeVal>=1 && palindromeVal <=1000000){
			listOfPalindromes = generatePalindromes(palindromeVal);
			counter = 0;
			boolean resultflag = true;
			while (resultflag){
				if (isPrime(palindromeVal)){
						System.out.println(palindromeVal);
						resultflag = false;
				}
				counter++;
			}	
		}
	}
}
