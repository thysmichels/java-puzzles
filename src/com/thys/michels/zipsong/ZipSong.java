package com.thys.michels.zipsong;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
/*
 * Author: Thys Michels
 * Website: http://www.thysmichels.com
 */
public class ZipSong extends PrintWriter{
	private BufferedReader r;
	private String line;
	private StringTokenizer st;
	private String token;

	public ZipSong(InputStream i) {
		super(new BufferedOutputStream(System.out));
		r = new BufferedReader(new InputStreamReader(i));
	}
	public ZipSong(InputStream i, OutputStream o) {
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

	private static String[] songQualityTotal;
	public static void main(String[] agrs){
		//String data = "4 2 \n 30 one \n 30 two \n 15 three \n 25 four\n";
		String data = "15 3\n197812 re_hash\n78906 5_4\n189518 tomorrow_comes_today\n39453 new_genious\n210492 clint_eastwood\n26302 man_research\n22544 punk\n19727 sound_check\n17535 double_bass\n18782 rock_the_house\n198189 19_2000\n13151 latin_simone\n12139 starshine\n11272 slow_country\n10521 m1_a1\n";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		//System.setIn(stdin);
		TreeMap<Long, String> listOfSongsAndAlbums = new TreeMap<Long, String>(Collections.reverseOrder());
		ZipSong io = new ZipSong(System.in, System.out);
		HashMap<Long, Long> songTotalAndSelect = new HashMap<Long, Long>();
		songTotalAndSelect.put(io.getLong(), io.getLong());
		Long rowCounter = new Long(0);
		while (io.hasMoreTokens()) {
			rowCounter++;
			if (songTotalAndSelect.keySet().iterator().next() <= rowCounter)
			{
				Long songCount = io.getLong();
				String songName = io.getWord();
			    if (songCount >= 0 && songCount <= Math.pow(10,12) && songName.length()<=30 && songName.matches("^[a-z0-9_]+") && !listOfSongsAndAlbums.containsValue(songName))
			    {
			    	if (listOfSongsAndAlbums.size() <= songTotalAndSelect.values().iterator().next())
			    		listOfSongsAndAlbums.put(rowCounter*songCount, songName);
			    	else if ((rowCounter*songCount) > listOfSongsAndAlbums.firstKey())
			    	{
			    		listOfSongsAndAlbums.remove(listOfSongsAndAlbums.lastKey());
			    		listOfSongsAndAlbums.put(rowCounter*songCount, songName);
			    	}
			    		
			     }
			}
		}
		listOfSongsAndAlbums.remove(listOfSongsAndAlbums.lastKey());
		
		for (String songResult : listOfSongsAndAlbums.values())
				System.out.println(songResult);
		  
		io.close();
	}
}
