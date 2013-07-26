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

public class SumsInTriangle extends PrintWriter {

	private BufferedReader r;
	private String line;
	private StringTokenizer st;
	private String token;

	public SumsInTriangle(InputStream i) {
		super(new BufferedOutputStream(System.out));
		r = new BufferedReader(new InputStreamReader(i));
	}
	public SumsInTriangle(InputStream i, OutputStream o) {
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

	public static int fact(int number){
		if (number == 1)
			return 1;
		return fact(number-1)+number;
	}
	//Moving index
	public static void main(String[] args) {
		String data = "2\n3\n1\n2 1\n1 2 3\n4\n1\n1 2\n4 1 2\n2 3 1 1\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		SumsInTriangle io = new SumsInTriangle(System.in, System.out);
		int n = io.getInt();
		for (int k = 0; k<n && n<100; k++){
			int c = io.getInt();
			System.out.println("c"+c);
			int counter = 0;
			for (int m = 0; m < fact(c); m++){
				if (m == 0)
					counter=io.getInt();
				else{
					int val1= io.getInt();
					int val2 = io.getInt();
					counter+=Math.max(val1, val2);
					System.out.println(m + " " + val1  + " " + val2 + " " + counter);
				}
			}
			System.out.println("Hier" + counter);
		}
	}

}
