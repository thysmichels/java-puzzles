package com.thys.michels.codechef;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class PrimePalindromes {

	public static void main(String[] args) {
		String data = "31\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(new BufferedInputStream(System.in), "UTF-8");
		Long palindromeVal = Long.parseLong(scanner.nextLine());
		if (palindromeVal>=1 && palindromeVal <=1000000){
			for (Long pcounter = palindromeVal; pcounter<= 10000 ; pcounter++){
				Boolean flagPrime = true;
				if (pcounter%2==0){
					flagPrime = false;
				}
				else if (flagPrime == true){
					for (int i = 3; i*i<=pcounter;i+=2){
						if (pcounter%i==0)
							flagPrime = false;
					}
				}
				if (flagPrime == true){
					Boolean flagPalindrome = true;
					char[] pCounterChar = pcounter.toString().toCharArray();
					for (int start = 0, end=pCounterChar.length-1; start < end;start++, end--){
						if (pCounterChar[start] != pCounterChar[end]){
							flagPalindrome = false;
						}
					}
					if (flagPalindrome == true){
						System.out.println(pcounter);
						break;
					}
				}
			}
		}
	}
}
