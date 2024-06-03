package ProgProjects;
/*
 * Name: Ujjawal Agrawal 
 * Description: This program produces as output the words of "The House that Jack Built"
 */

// Write a program that produces as output the words of "The House that Jack Built." 
// Use methods for each verse and for repeated text. Here are the lyrics to use:

//This is the house that Jack built.
//
//This is the malt that lay in the house that Jack built.
//
//This is the rat that ate the malt
//That lay in the house that Jack built.
//
//This is the cat
//That killed the rat that ate the malt
//That lay in the house that Jack built.
//
//This is the dog that worried the cat
//That killed the rat that ate the malt
//That lay in the house that Jack built.
//
//This is the cow with the crumpled horn
//That tossed the dog that worried the cat
//That killed the rat that ate the malt
//That lay in the house that Jack built.
//
//This is the maiden all forlorn
//That milked the cow with the crumpled horn
//That tossed the dog that worried the cat
//That killed the rat that ate the malt
//That lay in the house that Jack built.


public class TheHouseJackBuilt {

	public static void main(String[] args) {
		printFirstLine();
		printVerseOne();
		printVerseTwo();
		printVerseThree();
		printVerseFour();
		printVerseFive();
		printVerseSix();
	}
	
	public static void printFirstLine()
	{
		System.out.println("This is the house that Jack built.");
		System.out.println();
	}
	
	public static void printVerseOne()
	{
		System.out.println("This is the malt that lay in the house that Jack built.");
		//printRepeatedText1();
		System.out.println();
	}
	public static void printVerseTwo()
	{
		System.out.println("This is the rat that ate the malt");
		printRepeatedText1();
		System.out.println();
	}	
	public static void printVerseThree()
	{
		System.out.println("This is the cat");
		printRepeatedText2();
		System.out.println();
	}	
	public static void printVerseFour()
	{
		System.out.println("This is the dog that worried the cat");
		printRepeatedText2();
		System.out.println();
	}
	public static void printVerseFive()
	{
		System.out.println("This is the cow with the crumpled horn");
		printRepeatedText3();
		System.out.println();
	}	
	public static void printVerseSix()
	{
		System.out.println("This is the maiden all forlorn");
		System.out.println("That milked the cow with the crumpled horn");
		printRepeatedText3();
		System.out.println();
	}	
	public static void printRepeatedText1()
	{ 
		System.out.println("That lay in the house that Jack built.");
	}
	public static void printRepeatedText2()
	{ 
		System.out.println("That killed the rat that ate the malt");
		printRepeatedText1();
	}
	public static void printRepeatedText3()
	{ 
		System.out.println("That tossed the dog that worried the cat");
		printRepeatedText2();
	}
}