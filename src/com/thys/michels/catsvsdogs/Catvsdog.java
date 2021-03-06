package com.thys.michels.catsvsdogs;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Catvsdog extends PrintWriter {
	private BufferedReader r;
	private String line;
	private StringTokenizer st;
	private String token;

	public Catvsdog(InputStream i) {
		super(new BufferedOutputStream(System.out));
		r = new BufferedReader(new InputStreamReader(i));
	}
	public Catvsdog(InputStream i, OutputStream o) {
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
		String data="2\n1 1 2\nC1 D1\nD1 C1\n1 2 4\nC1 D1\nC1 D1\nC1 D2\nD2 C1\n1 2 4\nC1 D1\nC1 D1\nC1 D2\nD2 C1";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Catvsdog io = new Catvsdog(System.in, System.out);
		Long testcase = io.getLong();
		for (int ktestcase=0; ktestcase<testcase && testcase<=100; ktestcase++) {
				TreeMap<String, Long> mapCatDogs = new TreeMap<String, Long>();
				Integer c = io.getInt();
				Integer d = io.getInt();
				Integer v = io.getInt();
				if (1 <=c && d <= 100 && v >=0 && v <= 500){
					for (int k = 1; k <= v*2; k++){
						String out = io.getWord();
						if (mapCatDogs.containsKey(out)){
							if (k%2!=0) mapCatDogs.put(out,mapCatDogs.get(out)+1);
						}
						else{
							if (k%2==0) mapCatDogs.put(out,(long) -1);
							else mapCatDogs.put(out,(long) 1);
						}
					}
					System.out.println(mapCatDogs.get(mapCatDogs.firstKey()));
				}
		}
		io.close();
	}
}
