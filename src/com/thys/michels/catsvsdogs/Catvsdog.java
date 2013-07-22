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
	
	public boolean hasMoreTokens() {
			return peekToken() != null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String data = "2 \n 1 1 2\n C1 D1 \n D1 C1\n 1 2 4\n C1 D1 \n C1 D1 \n C1 D2 \n D2 C1 \n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Catvsdog io = new Catvsdog(System.in, System.out);
		Long testcase = io.getLong();
		if (testcase <= 100){
			while (io.hasMoreTokens()) {
				TreeMap<String, Long> mapCatDogs = new TreeMap<String, Long>();
				Long c = io.getLong();
				Long d = io.getLong();
				Long v = io.getLong();
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
		}
	}
}
