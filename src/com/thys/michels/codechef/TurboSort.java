package com.thys.michels.codechef;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TurboSort extends PrintWriter {

	private BufferedReader r;
	private String line;
	private StringTokenizer st;
	private String token;

	public TurboSort(InputStream i) {
		super(new BufferedOutputStream(System.out));
		r = new BufferedReader(new InputStreamReader(i));
	}
	public TurboSort(InputStream i, OutputStream o) {
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

	public static void main(String[] args) {
		String data = "5\n5\n3\n6\n7\n1\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		TurboSort io = new TurboSort(System.in, System.out);
		int elementsInList = io.getInt();
		Long[] arrayListLong = new Long[elementsInList];
		for (int k =0; k< elementsInList; k++){
			arrayListLong[k]=io.getLong();
		}
		Arrays.sort(arrayListLong, Collections.reverseOrder());
		for (Long sortedList : arrayListLong){
			System.out.println(sortedList);
		}
		io.close();
	}
}
