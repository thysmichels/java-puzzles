package com.thys.michels.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        for (Integer i=1;i <= 100;i++) {
       	 String s = "";
       	 if (i%3==0) s="Fizz";
       	 if (i%5==0) s+="Buzz";
       	 if (s=="") s=i.toString();
       	 System.out.println(s);
        }
        
    }
}
