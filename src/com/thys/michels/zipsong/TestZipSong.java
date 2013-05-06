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
		String data = "4 2 \n 30 one \n 30 two \n 15 three \n 25 four";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		System.setIn(stdin);
		return scanner;
	}

	@Test
	public void testScannerAllInput()
	{
		assertEquals(5, ZipSong.readAll(setupScanner()).split("\\r?\\n").length);
	}
	
	@Test
	public void testScannerIntegerInput()
	{
		assertEquals(5, ZipSong.readInts(setupScanner()).size());
	}

}
