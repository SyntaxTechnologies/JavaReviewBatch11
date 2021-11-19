package com.syntax.review2;

public class StringReview {

	public static void main(String[] args) {

		String str = "Today is Thursday and it is Java Review";

		boolean empty = str.isEmpty();
		System.out.println("My string is empty = "+empty);
		
		/*
		 * str.full();
		 * The method full() is undefined for the type String
		 */
		
		int length=str.length();
		System.out.println("Length of the Strig is "+length);
		
		// Instead Thursday I want to have Monday
		
		str.replace("Thursday", "Monday");
		System.out.println(str);
		
		// how many words my string has?
		String[] allWords=str.split(" ");
		System.out.println("In my string I have "+allWords.length+" words");
		
		//print all words 1 by 1
		for(String word:allWords) {
			System.out.print(word+", ");
		}
		
		System.out.println();
		//how would you reverse a String? 
		String give="Hello"; //length=5
		
		StringBuilder sb=new StringBuilder(give);
		sb.reverse();
		System.out.println(sb);
		
		//how would you reverse a String without using reverse
		String reverse="";
		
		for(int i=give.length()-1; i>=0;i--) {
			reverse+=give.charAt(i);
		}

		System.out.println(reverse);
		
		//substring
		String s="Today I am happy";
		
		s=s.substring(6);
		System.out.println(s); //I am happy
		
		s=s.substring(0,4);
		System.out.println(s); //I am

	}
}
