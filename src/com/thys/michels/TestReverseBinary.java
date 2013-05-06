package com.thys.michels;
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
public class TestReverseBinary { 
		
	public static Scanner setupScanner()
	{
		String data = "13 \n 47 \n 999999 \n 1000000000 \n";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		System.setIn(stdin);
		return scanner;
	}
	public static List<Integer> setupIntegerList()
	{
		List<Integer> inputIntegers = new ArrayList<Integer>();
		inputIntegers.add(0);
		inputIntegers.add(1000000001);
		inputIntegers.add(13);
		inputIntegers.add(47);
		return inputIntegers;
	}
	
	@Test
	public void testScannerAllInput()
	{
		assertEquals(31, ReverseBinaryNumbers.readAll(setupScanner()).length());
	}
	
	@Test
	public void testScannerIntegerInput()
	{
		assertEquals(4, ReverseBinaryNumbers.readInts(setupScanner()).size());
		assertEquals(13, ReverseBinaryNumbers.readInts(setupScanner()).toArray()[0]);
	}
	
	@Test
	public void testReverseBinaryValueOf13() {
		assertEquals(ReverseBinaryNumbers.reverseBinaryIntegerNumber(13).toString(), "11");
		assertEquals(ReverseBinaryNumbers.printReverseBinaryIntegerNumber(setupIntegerList()).toArray()[0], 11);	
	}
	
	@Test
	public void testReverseBinaryValueOf47() {
		assertEquals(ReverseBinaryNumbers.reverseBinaryIntegerNumber(47).toString(), "61");
		assertEquals(ReverseBinaryNumbers.printReverseBinaryIntegerNumber(setupIntegerList()).toArray()[1], 61);
	}
	
	@Test
	public void endToEndTest()
	{
		assertEquals(11, ReverseBinaryNumbers.printReverseBinaryIntegerNumber(ReverseBinaryNumbers.readInts(setupScanner())).toArray()[0]);
		assertEquals(61, ReverseBinaryNumbers.printReverseBinaryIntegerNumber(ReverseBinaryNumbers.readInts(setupScanner())).toArray()[1]);
		assertEquals(1033263, ReverseBinaryNumbers.printReverseBinaryIntegerNumber(ReverseBinaryNumbers.readInts(setupScanner())).toArray()[2]);
		assertEquals(1365623, ReverseBinaryNumbers.printReverseBinaryIntegerNumber(ReverseBinaryNumbers.readInts(setupScanner())).toArray()[3]);
	}

}
