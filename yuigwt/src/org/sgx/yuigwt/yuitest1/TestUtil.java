package org.sgx.yuigwt.yuitest1;

import java.util.Random;
/**
 * test related utilities 
 * @author sg
 *
 */
public class TestUtil {
	private static TestUtil instance;

	public static TestUtil getInstance() {
		if (null == instance) {
			instance = new TestUtil();
		}
		return instance;
	}

	private String[] words; 
	private Random rand;

	private TestUtil() {
		rand = new Random();
		words = new String[] { "neque", "porro", "quisquam", "est", "qui", "dolorem", "ipsum", "quia", "dolor", "sit", "amet", "consectetur", "adipisci", "velit" };
	}
	
	public String randomWords(int wordCount) {
		StringBuffer sb = new StringBuffer();
		randomWords(sb, wordCount); 
		return sb.toString();
	}

	public void randomWords(StringBuffer sb, int wordCount) {
		for (int i = 0; i < wordCount; i++) {
			sb.append(words[randomBetween(0, words.length-1)]+" ");
		}
	}

	public int randomBetween(int min, int max) {
		Random rand = getRandom();
		int randomNum = rand.nextInt(max - min + 1) + min;
		return randomNum;
	}
	public Color randomColor() {
		return new Color(randomBetween(0,  255), randomBetween(0,  255), randomBetween(0,  255)); 
	}
	
	public Random getRandom() {
		return rand;
	}
	

	int randomLetterMinChar = 97, randomLetterMaxChar = 122; 
	
	public String randomLetters(int letterCount) {
		String s = ""; 
		for (int i = 0; i <letterCount; i++) {
			int c = randomBetween(randomLetterMinChar, randomLetterMaxChar); 
			s+=((char)c); //Character.toChars(c); 
		}
		return s; 		
	}

	public Boolean randomBoolean() {
		return randomBetween(0, 9)<5; 
	}
}
