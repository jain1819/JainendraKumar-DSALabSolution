package com.gl.dsaLab1010.main;

import java.util.*;

import com.gl.dsaLab1010.function.BracketSeparation;
import com.gl.dsaLab1010.function.StackBalancing;

public class Bracketmain {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scr = new Scanner(System.in);
			//Entering the string
			System.out.println("Enter the string containing brackets");
			String brackets = scr.next();
			scr.close();
			
		
			//using BracketSeparation class to separate brackets from other symbols ,letters and numbers
			
			String str= BracketSeparation.Separation(brackets);
			if( StackBalancing.Balancing(str) ) {
				System.out.println( "Given String is balanced " );
			} 
			else {
				System.out.println( "Given String is not balanced " );
			}

	}

}
