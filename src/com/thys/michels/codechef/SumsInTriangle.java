package com.thys.michels.codechef;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class SumsInTriangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//String data = "1000\n3\n1\n2 1\n1 2 3\n4\n1\n1 2\n4 1 2\n2 3 1 1\n4\n1\n1 3\n2 1 1\n1 2 1 1\n";
		//System.setIn(new ByteArrayInputStream(data.getBytes()));
		java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader (System.in));
		long n = Long.parseLong(r.readLine().trim());
		for (long k = 0; k<n && n<1000; k++){
			long c = Long.parseLong(r.readLine().trim());
			long summax = 0;
			int counter = 0;
			for (long m = 0; m < c && c <100; m++){
				String[] val = r.readLine().trim().split("\\s+");
				if (m == 0)
					summax =Long.parseLong(val[0]);
				else{
					
					if (Long.parseLong(val[counter]) < Long.parseLong(val[counter+1])){
						summax += Long.parseLong(val[counter+1]);
						counter++;
					}
					else{
						summax += Long.parseLong(val[counter]);
						if (counter > 0)
							counter--;
					}	
				}
			}
			System.out.println(summax);
		}
	}
}
