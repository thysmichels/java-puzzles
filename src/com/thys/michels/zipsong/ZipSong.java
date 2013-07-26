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

	public static void main(String[] agrs){
		String data = "15 3\n" +
				"197812 re_hash\n" +
				"1 test\n" +
				"2 tomorrow_comes_today\n" +
				"39453 new_genious\n" +
				"210492 clint_eastwood\n" +
				"26302 man_research\n" +
				"22544 punk\n" +
				"19727 sound_check\n" +
				"17535 double_bass\n" +
				"110000 rock_the_house\n" +
				"100000 19_2000\n" +
				"13151 latin_simone\n" +
				"12139 starshine\n" +
				"11272 slow_country\n" +
				"10521 m1_a1\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		TreeMap<Long, String> listOfSongsAndAlbums = new TreeMap<Long, String>(Collections.reverseOrder());
		ZipSong io = new ZipSong(System.in, System.out);
		HashMap<Long, Long> songTotalAndSelect = new HashMap<Long, Long>();
		songTotalAndSelect.put(io.getLong(), io.getLong());
		Long rowCounter = new Long(0);
		while (io.hasMoreTokens()) {
			rowCounter++;
			if (rowCounter <= songTotalAndSelect.keySet().iterator().next()){
				Long songCount = io.getLong();
				String songName = io.getWord();
			    if (songCount >= 0 && songCount <= Math.pow(10,12) && songName.length()<=30 && songName.matches("^[a-z0-9_]+")){
			    	if (listOfSongsAndAlbums.size() == 0)
			    		listOfSongsAndAlbums.put(rowCounter*songCount, songName);
			    	else if (listOfSongsAndAlbums.size() < songTotalAndSelect.values().iterator().next() && (rowCounter*songCount) != listOfSongsAndAlbums.firstKey())
			    		listOfSongsAndAlbums.put(rowCounter*songCount, songName);
			    	else if ((rowCounter*songCount) > listOfSongsAndAlbums.firstKey() && (rowCounter*songCount) != listOfSongsAndAlbums.firstKey()){
			    		listOfSongsAndAlbums.remove(listOfSongsAndAlbums.lastKey());
			    		listOfSongsAndAlbums.put(rowCounter*songCount, songName);
			    	}
			    }
			}
		}
			
		for (String songResult : listOfSongsAndAlbums.values())
				System.out.println(songResult);
		  
		io.close();
	}
}
