package com.thys.michels.codechef;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class PrimePalindromes {

	public static void main(String[] args) {
		String data = "99000\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(new BufferedInputStream(System.in), "UTF-8");
		long palindromeVal = Long.parseLong(scanner.nextLine());
		if (palindromeVal>=1 && palindromeVal <=1000000){
			boolean resultflag = false;
			Long pcounter = palindromeVal;
			while (resultflag == false){
				boolean flagPrime = true;
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
					boolean flagPalindrome = true;
					char[] pCounterChar = pcounter.toString().toCharArray();
					for (int start = 0, end=pCounterChar.length-1; start < end;start++, end--){
						if (pCounterChar[start] != pCounterChar[end]){
							flagPalindrome = false;
						}
					}
					if (flagPalindrome == true){
						System.out.println(pcounter);
						resultflag = true;
					}
				}
				pcounter++;
			}
		}
	}
}
