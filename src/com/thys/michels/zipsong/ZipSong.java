package com.thys.michels.zipsong;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
/*
 * Author: Thys Michels
 * Website: http://www.thysmichels.com
 */
public class ZipSong {
	private static String[] songQualityTotal;
	public static void main(String[] agrs){
		String data = "15 3\n197812 re_hash\n78906 5_4\n189518 tomorrow_comes_today\n39453 new_genious\n210492 clint_eastwood\n26302 man_research\n22544 punk\n19727 sound_check\n17535 double_bass\n18782 rock_the_house\n198189 19_2000\n13151 latin_simone\n12139 starshine\n11272 slow_country\n10521 m1_a1\n";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		System.setIn(stdin);
		songQualityTotal = scanner.nextLine().split("\\s+");
		TreeMap<Long, String> listOfSongsAndAlbums = new TreeMap<Long, String>(Collections.reverseOrder());
		int rowCounter = 1;
		for (String field : scanner.useDelimiter("\\A").next().trim().split("[\\r\\n]+")){
			rowCounter++;
			Long songCount = Long.valueOf(field.trim().split("\\s+")[0]);
			String songName = field.trim().split("\\s+")[1];
			if (songCount >= 0 && songCount <= Math.pow(10,12) && songName.length()<=30 && songName.matches("^[a-z0-9_]+"))
				listOfSongsAndAlbums.put(songCount*(rowCounter), songName);
		}
		for (String songResult : listOfSongsAndAlbums.values())
			System.out.println(songResult);
		}
}
