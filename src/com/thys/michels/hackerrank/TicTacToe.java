package com.thys.michels.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TicTacToe {
	/* Complete the function below to print 2 integers separated by a single space which will be your next move */
   static void nextMove(String player, String [] board){
	   //asqii X0_
	   //which player am i
	   for (String b : board)
	   {
		   
	   }
  }
  
  public static void main(String[] args) {
		String data = "X \n ___ \n ___ \n _XO \n";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner in = new Scanner(System.in);
		System.setIn(stdin);
        //Scanner in = new Scanner(System.in);
        String player;
        String board[] = new String[3];

        //If player is X, I'm the first player.
        //If player is O, I'm the second player.
        player = in.next();
        System.out.println(player);
        //Read the board now. The board is a 3x3 array filled with X, O or _.
        for(int i = 0; i < 3; i++) {
            board[i] = in.next();
            System.out.println(board[i]);
        }

        nextMove(player,board);   
    }
}
