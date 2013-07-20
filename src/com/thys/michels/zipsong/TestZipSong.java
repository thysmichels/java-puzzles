package com.thys.michels.zipsong;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

/*
 * Author: Thys Michels
 * Website: http://www.thysmichels.com
 */
public class TestZipSong { 
	
	public static Scanner setupScanner()
	{
		//String data = "15 3\n197812 re_hash\n78906 5_4\n189518 tomorrow_comes_today\n39453 new_genious\n210492 clint_eastwood\n26302 man_research\n22544 punk\n19727 sound_check\n17535 double_bass\n18782 rock_the_house\n198189 19_2000\n13151 latin_simone\n12139 starshine\n11272 slow_country\n10521 m1_a1\n";
		String data = "4 2 \n 30 one \n 30 two \n 15 three \n 25 four\n";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		System.setIn(stdin);
		return scanner;
	}

	@Test
	public void testScannerAllInput()
	{
		//assertEquals(5, ZipSong.readAll(setupScanner()).split("\\r?\\n").length);
	}
	
	@Test
	public void testScannerIntegerInput()
	{
		//assertEquals(5, ZipSong.readInts(setupScanner()).size());
	}

}
