package com.thys.michels.codechef;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class PrimePalindromes extends PrintWriter {
	private BufferedReader r;
	private String line;
	private StringTokenizer st;
	private String token;

	public PrimePalindromes(InputStream i) {
		super(new BufferedOutputStream(System.out));
		r = new BufferedReader(new InputStreamReader(i));
	}
	public PrimePalindromes(InputStream i, OutputStream o) {
		super(new BufferedOutputStream(o));
		r = new BufferedReader(new InputStreamReader(i));
	}
	   
	public long getLong() {
		return Long.parseLong(nextToken().trim());
	 }

	 public String getWord() {
			return nextToken().trim();
	 }
	 
	 private String nextToken() {
			String ans = peekToken();
			token = null;
			return ans;
	 }
	 private String peekToken() {
			if (token == null) 
			    try {
				while (st == null || !st.hasMoreTokens()) {
				    line = r.readLine();
				    if (line == null) return null;
				    st = new StringTokenizer(line);
				}
				token = st.nextToken();
			    } catch (IOException e) { }
			return token;
	}
	
	public boolean hasMoreTokens() {
			return peekToken() != null;
	}
	
	public int getInt() {
		return Integer.parseInt(nextToken());
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
	
	public static void main(String[] args) {
		String data = "99000\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		PrimePalindromes io = new PrimePalindromes(System.in, System.out);
		long palindromeVal = io.getLong();
		if (palindromeVal>=1 && palindromeVal <=1000000){
			boolean resultflag = false;
			while (resultflag == false){
				if (isPalindrome(palindromeVal)){
					boolean flagPrime=true;
					for (int divisor = 2; divisor <= palindromeVal / 2; divisor++){
						if (palindromeVal % divisor == 0) 
							flagPrime = false;
					}
					if (flagPrime==true){
						System.out.println(palindromeVal);
						resultflag = true;
					}
				}
				palindromeVal++;
			}	
		}
	}
}
