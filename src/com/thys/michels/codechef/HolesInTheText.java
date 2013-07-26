package com.thys.michels.codechef;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class HolesInTheText extends PrintWriter{

	private static final Set<Character> VALUESPLUSONE = new HashSet<Character>(Arrays.asList(new Character[]{'A', 'D', 'O', 'P','R'}));
	private static final Set<Character> VALUESPLUSTWO = new HashSet<Character>(Arrays.asList(new Character[]{'B'}));
	
	private BufferedReader r;
	private String line;
	private StringTokenizer st;
	private String token;

	public HolesInTheText(InputStream i) {
		super(new BufferedOutputStream(System.out));
		r = new BufferedReader(new InputStreamReader(i));
	}
	public HolesInTheText(InputStream i, OutputStream o) {
		super(new BufferedOutputStream(o));
		r = new BufferedReader(new InputStreamReader(i));
	}
	   
	public long getLong() {
		return Long.parseLong(nextToken().trim());
	 }

	 public String getWord() {
			return nextToken().trim();
	 }
	 public int getInt() {
			return Integer.parseInt(nextToken());
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
		String data = "2\nCODECHEF\nDRINKEATCODE\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		HolesInTheText io = new HolesInTheText(System.in, System.out);
		int T = io.getInt();
		for (int k = 0; k < T && T<=40; k++){
			char[] word = io.getWord().toCharArray();
			Integer counter = 0;
			for (int charword = 0; charword < word.length && word.length < 100; charword++){
				if (VALUESPLUSONE.contains(word[charword]))
					counter++;
				else if (VALUESPLUSTWO.contains(word[charword]))
					counter+=2;
			}
			System.out.println(counter);
		}
	}
}
