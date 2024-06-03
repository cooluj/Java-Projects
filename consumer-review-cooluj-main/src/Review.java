import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
/**
 * @author 
 *
 */
public class Review {

	private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
	private static ArrayList<String> posAdjectives = new ArrayList<String>();
	private static ArrayList<String> negAdjectives = new ArrayList<String>();


	private static final String SPACE = " ";

	static{
		try {
			Scanner input = new Scanner(new File("cleanSentiment.csv"));
			while(input.hasNextLine()){
				String[] temp = input.nextLine().split(",");
				sentiment.put(temp[0],Double.parseDouble(temp[1]));
				//System.out.println("added "+ temp[0]+", "+temp[1]);
			}
			input.close();
		}
		catch(Exception e){
			System.out.println("Error reading or parsing cleanSentiment.csv");
		}


		//read in the positive adjectives in postiveAdjectives.txt
		try {
			Scanner input = new Scanner(new File("positiveAdjectives.txt"));
			while(input.hasNextLine()){
				String temp = input.nextLine().trim();
				posAdjectives.add(temp);
			}
			input.close();
		}
		catch(Exception e){
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}   

		//read in the negative adjectives in negativeAdjectives.txt
		try {
			Scanner input = new Scanner(new File("negativeAdjectives.txt"));
			while(input.hasNextLine()){
				negAdjectives.add(input.nextLine().trim());
			}
			input.close();
		}
		catch(Exception e){
			System.out.println("Error reading or parsing negativeAdjectives.txt");
		}   
	}

	/** 
	 * returns a string containing all of the text in fileName (including punctuation), 
	 * with words separated by a single space 
	 */
	public static String textToString( String fileName )
	{  
		String temp = "";
		try {
			Scanner input = new Scanner(new File(fileName));

			//add 'words' in the file to the string, separated by a single space
			while(input.hasNext()){
				temp = temp + input.next() + " ";
			}
			input.close();

		}
		catch(Exception e){
			System.out.println("Unable to locate " + fileName);
		}
		//make sure to remove any additional space that may have been added at the end of the string.
		return temp.trim();
	}

	/**
	 * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
	 */
	public static double sentimentVal( String word )
	{
		try
		{
			return sentiment.get(word.toLowerCase());
		}
		catch(Exception e)
		{
			return 0;
		}
	}

	/**
	 * Returns the ending punctuation of a string, or the empty string if there is none 
	 */
	public static String getPunctuation( String word )
	{ 
		String punc = "";
		for(int i=word.length()-1; i >= 0; i--){
			if(!Character.isLetterOrDigit(word.charAt(i))){
				punc = punc + word.charAt(i);
			} else {
				return punc;
			}
		}
		return punc;
	}

	/**
	 * Returns the word after removing any beginning or ending punctuation
	 */
	public static String removePunctuation( String word )
	{
		while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
		{
			word = word.substring(1);
		}
		while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
		{
			word = word.substring(0, word.length()-1);
		}

		return word;
	}

	/** 
	 * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
	 */
	public static String randomPositiveAdj()
	{
		int index = (int)(Math.random() * posAdjectives.size());
		return posAdjectives.get(index);
	}

	/** 
	 * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
	 */
	public static String randomNegativeAdj()
	{
		int index = (int)(Math.random() * negAdjectives.size());
		return negAdjectives.get(index);

	}

	/** 
	 * Randomly picks a positive or negative adjective and returns it.
	 */
	public static String randomAdjective()
	{
		boolean positive = Math.random() < .5;
		if(positive){
			return randomPositiveAdj();
		} else {
			return randomNegativeAdj();
		}
	}

	/**
	 * Activity 1
	 * @param adjective the adjective to get its sentiment value
	 * @return a String containing the adjective and its sentiment value in the
	 *         format "adjective:sentimentValue"
	 */
	public static String sentimentOutput(String adjective) {
		double sentimentValue = sentimentVal(adjective);
		return (adjective + ":" + sentimentValue); 
	}
	
	
	/** Activity 2
	* Determines the sentiment value of a review.
	* @param fileName The file to open and determine the total sentiment for.
	* @return the sentiment value for the file fileName.
	*/
	public static double totalSentiment(String fileName) {
	//String combined = textToString(fileName);
	//removePunctuation(combined);
	//total = fileName.
	//double sum = 0;
	//int initial = 0;
	//for(int i = 0; i < fileName.length(); i++) {
	// if ((text.substring(i).equals(Review.SPACE)==true)) {
	//total = total + fileName.substring(initial, i);
	//}
	//}

		String text = Review.textToString(fileName);
		text = text + " ";
		int b = 0;
		double total = 0;
		String word;
		for (int i = 0; i < text.length(); i++) {
	if ((text.substring(i, i+1)).equals(Review.SPACE)==true){
	word = text.substring(b, i);
	word = Review.removePunctuation(word);
	System.out.println(word);
	total = total + Review.sentimentVal(word);
	b = i + 1;
	}
	}
	return (double) total;
	}

	//return Double.MIN_VALUE;
	//repeat while there is still spaces
	//get word
	//get word sentiment
	//make problem smaller maybe by altering string to move to the next word
	//add to total
	//get sentiment for last word
	//add to total
	//return total



	/**
	* Activity 2
	* Determines the average sentiment of all words in a review.
	* @param fileName The file to open and determine the total sentiment for.
	* @return the file sentinment average
	*/
	public static double averageSentiment(String fileName) {
		String text = Review.textToString(fileName);
		text = text + " ";
		int b = 0;
		double dividen = 0;
		double total = 0;
		String word;
		for (int i = 0; i < text.length(); i++) {
			if ((text.substring(i, i+1)).equals(Review.SPACE)==true){
				word = text.substring(b, i);
				word = Review.removePunctuation(word);
				System.out.println(word);
				total = total + Review.sentimentVal(word);
				b = i + 1;
				dividen++;
				}
			}
		dividen= (total/dividen);
		return dividen;
		}




	/** Activity 2
	* Determines the star rating of a review
	* @param fileName The file to open and determine the start rating for.
	* @return the star rating for the file fileName.
	*/

	public static int starRating(String fileName) {
		int bauh = (int) Review.totalSentiment(fileName);
		int dog = 0;
		if(bauh>=20) {
			return (dog + 4);
	}
		if(bauh>=10) {
			return (dog + 3);
	}
		if(bauh>=0) {
			return (dog + 2);
	}
		if(bauh>=-10) {
			return (dog + 1);
	}
		return (dog);
	}

	/**
	* Activity 3
	* @param fileName the file containing the annotated review
	* @return a fake review based on fileName.
	*/
	public static String fakeReview(String fileName)
	{
	String text = textToString(fileName);
	String[] words = text.split(" ");
	String returnStr = "";
	for(int i = 0; i < words.length; i ++) {
	String word = removePunctuation(words[i]);
	if(words[i].indexOf("*") == 0) {
	if(sentimentVal(word) > 0) {
	words[i] = randomPositiveAdj();
	} else {
	words[i] = randomNegativeAdj();
	}
	}
	}
	for(int i = 0; i < words.length; i ++) {
	returnStr += words[i] + " ";
	}
	return returnStr;
	} // end of method fakeReview




	/**
	* Activity 4
	* @param fileName the file containing the annotated review
	* @param morePositive true creates a positive review; otherwise a negative review
	* @return a fake review based on fileName
	*/
	public static String fakeReview2 (String fileName, boolean morePositive) {
	String text = textToString(fileName);
	String[] words = text.split(" ");
	String[] positiveAdjs = textToString("positiveAdjectives.txt").split(" ");
	String[] negativeAdjs = textToString("negativeAdjectives.txt").split(" ");
	String returnStr = "";
	for(int i = 0; i < words.length; i ++) {
	String word = removePunctuation(words[i]);
	if(words[i].indexOf("*") == 0){
	if(morePositive) {
	double sentiment = Math.abs(1.5 * sentimentVal(word));
	for(int k = 0; k < positiveAdjs.length; k ++) {
	if(sentimentVal(positiveAdjs[k]) >= sentiment) {
	words[i] = positiveAdjs[k];
	}
	}
	} else {
	double sentiment = -1 *(Math.abs(1.5 * sentimentVal(word)));
	for(int k = 0; k < negativeAdjs.length; k ++) {
	if(sentimentVal(negativeAdjs[k]) <= sentiment) {
	words[i] = negativeAdjs[k];
	}
	}
	}
	}



	}
	for(int j = 0; j < words.length; j ++) {
	returnStr += words[j] + " ";
	}
	return returnStr;
	}
	}
