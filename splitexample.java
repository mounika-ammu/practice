package com.basicpractivejavanov;

import java.util.Arrays;

public class splitexample {
	public static void main(String[] args) {
		String s1="mounika alla vani cat dog illl";
		String[] split = s1.split(" ");
	    Arrays.sort(split, (a, b) -> Integer.compare(a.length(), b.length()));

        // Print the words in ascending order
        System.out.println("Words in Ascending Order based on Length:");
        for (String word : split) {
            System.out.println(word);
        }
    }
}