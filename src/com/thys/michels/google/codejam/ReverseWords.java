package com.thys.michels.google.codejam;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ReverseWords{
	
	public static void main(String[] args) {
		String data = "3 \n this is a test \n foobar \n all your base\n";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
	
		Scanner scanner = new Scanner(new BufferedInputStream(System.in), "UTF-8");
		Long totalLines = Long.parseLong(scanner.nextLine().trim());
		Long lineCount = new Long(0);
		
		for (String sentence : scanner.useDelimiter("\\A").next().trim().split("[\\r\\n]+")){
			lineCount++;
			if (lineCount <= totalLines){
				String reverseSentence = "";
				for (int words = sentence.split("\\s+").length-1; words>=0;words--)
					reverseSentence+= sentence.split("\\s+")[words] + " ";
				System.out.println("Case #" + lineCount + ": " +  reverseSentence.trim());
			}
		}
	}
}
