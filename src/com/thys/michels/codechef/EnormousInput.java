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

public class EnormousInput extends PrintWriter {

	private BufferedReader r;
	private String line;
	private StringTokenizer st;
	private String token;

	public EnormousInput(InputStream i) {
		super(new BufferedOutputStream(System.out));
		r = new BufferedReader(new InputStreamReader(i));
	}
	public EnormousInput(InputStream i, OutputStream o) {
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
	public static void main(String[] args) {
		EnormousInput io = new EnormousInput(System.in, System.out);
		Long n = io.getLong();
		Long k = io.getLong();
		Long totalDivByK = new Long(0);
		while (io.hasMoreTokens()) {
			Long val = io.getLong();
			if (val <= Math.pow(10, 9) && val%k==0)
				totalDivByK++;
		}
		System.out.println(totalDivByK);
	}
}
