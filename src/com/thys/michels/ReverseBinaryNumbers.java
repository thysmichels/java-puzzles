package com.thys.michels;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Author: Thys Michels
 * Website: http://www.thysmichels.com
 */
public class ReverseBinaryNumbers {

    private static String charsetName = "UTF-8";
    private static Scanner scanner = new Scanner(new BufferedInputStream(System.in), charsetName);

 	public static String readAll(Scanner scanner) {
	        if (!scanner.hasNextLine()) return null;
	        return scanner.useDelimiter("\\A").next();
	}
	
	public static List<Integer> readInts(Scanner scanner) {
	        String[] fields = readAll(scanner).trim().split("\\s+");
	        List<Integer> vals = new ArrayList<Integer>();
	        for (String field : fields)
	        {
	        	vals.add( Integer.parseInt(field));
	        }
	        return vals;
	}
	
	public static Integer reverseBinaryIntegerNumber(Integer inputNumber)
	{
		return Integer.parseInt(new StringBuffer(Integer.toBinaryString(inputNumber)).reverse().toString(),2);
	}

	public static List<Integer> printReverseBinaryIntegerNumber(List<Integer> binaryIntegers)
	{
		List<Integer> outputMessage = new ArrayList<Integer>();
		for (Integer inputNumber: binaryIntegers)
		{
			if (inputNumber > 0 && inputNumber < 1000000001)
				outputMessage.add(reverseBinaryIntegerNumber(inputNumber));
		}
		return outputMessage;
	}
	
	public static void main (String[] args)
	{
		for (Integer output : printReverseBinaryIntegerNumber(readInts(scanner)))
		{
			System.out.println(output);
		}
	}
}
