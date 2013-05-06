package com.thys.michels.zipsong;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * Author: Thys Michels
 * Website: http://www.thysmichels.com
 */

public class ZipSong {
	
	 private static String charsetName = "UTF-8";
	 private static Scanner scanner = new Scanner(new BufferedInputStream(System.in), charsetName);

	 public static String readAll(Scanner scanner) {
	 		if (!scanner.hasNextLine()) return null;
	 			return scanner.useDelimiter("\\A").next();
	}
	 
	 public static HashMap<String, List<String>> readInts(Scanner scanner) {
		 String[] fields = readAll(scanner).trim().split("\\r?\\n");
		 HashMap<String, List<String>> vals = new HashMap<String, List<String>>();
		 Integer counter = 0;
		 for (String field : fields)
		 {
			 counter++;
			 List<String> songInfo = new ArrayList<String>();
			 for (String song : field.trim().split("\\s+"))
			 {
				 if (counter == 1)
				 {
					 if (Integer.parseInt(song) > 0 &&  Integer.parseInt(song) < 50001)
						 songInfo.add(song);
				 }
				 else
				 {
					 if (songInfo.size() == 0 && Integer.valueOf(song) >0 && Integer.valueOf(song) < Math.pow(10,12))
					 {
						 songInfo.add(song);
					 }
					 else if (songInfo.size() == 1 && song.length() < 31)
					 {
						 songInfo.add(song);
					 }
				 }
			 }
				 
			 
			 vals.put(counter.toString(), songInfo);
		 }
		 return vals;
	}
	 
	public static List<String> printSongsQuality(HashMap<String, List<String>> songs)
	{
		//1 ² n ² 50000, 1 ² m ² n
		
		return null;
	}
	
	public static void main(String[] agrs)
	{
		
	}

}
