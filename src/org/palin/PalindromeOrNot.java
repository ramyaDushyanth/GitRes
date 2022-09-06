package org.palin;

import java.util.Scanner;

public class PalindromeOrNot {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("\nTo check palindrome or not\n==========================");
	System.out.println("Enter the word:");
	String word = s.next();
	String rev = "";
	for (int i = word.length() - 1; i >= 0; i--) {
		char ch = word.charAt(i);
		rev = rev + ch;
	}
	System.out.println("Given String:" + word);
	System.out.println("Reversed String:" + rev);
    if (word.equals(rev)) {
		System.out.println("Palindrome");

	} else {
		System.out.println("Not palindrome");
	}
    System.out.println("succesful");

}

}

