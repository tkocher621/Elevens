package com.company;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"a", "b", "c"};
		String[] suits = {"grafes", "lions"};
		int[] values = {2, 1, 6};
		Deck d = new Deck(ranks, suits, values);
	}
}
