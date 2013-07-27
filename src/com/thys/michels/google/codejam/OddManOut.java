package com.thys.michels.google.codejam;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class OddManOut extends PrintWriter {
	private BufferedReader r;
	private String line;
	private StringTokenizer st;
	private String token;
	private static OddManOut io;

	public OddManOut(InputStream i) {
		super(new BufferedOutputStream(System.out));
		r = new BufferedReader(new InputStreamReader(i));
	}
	public OddManOut(InputStream i, OutputStream o) {
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
	public int getInt() {
			return Integer.parseInt(nextToken());
	}
	
	public boolean hasMoreTokens() {
			return peekToken() != null;
	}
	public static void main(String[] args) {
		String data = "3\n 3\n 1 2147483647 2147483647\n5\n 3 4 7 4 3\n5\n2 10 2 10 5";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		io = new OddManOut(System.in, System.out);
		Long testcases = io.getLong();
		for (int t = 1; t <= testcases && testcases >=1 && testcases<=50; t++){
			Long numberOfGuests = io.getLong();
			ArrayList<Long> countGuestNumber = new ArrayList<Long>();
			for (int g = 0; g < numberOfGuests && numberOfGuests > 0 && numberOfGuests <= 2147483647; g++){
				Long guestNumber = io.getLong();
				if (countGuestNumber.contains(guestNumber))
					countGuestNumber.remove(guestNumber);
				else
					countGuestNumber.add(guestNumber);
			}
			System.out.println("Case #" + t +": " + countGuestNumber.get(0));
		}
		
	}

}
