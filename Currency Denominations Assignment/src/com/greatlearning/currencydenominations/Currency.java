package com.greatlearning.currencydenominations;

public class Currency {

	public void Denominations(int[] notes, int amount) {
		int count[] = new int[notes.length];
		for (int i = 0; i < notes.length; i++) {
			if (amount >= notes[i]) {
				count[i] = amount / notes[i];
				amount = amount - count[i] * notes[i];
			}
		}
		if (amount > 0)
			System.out.println("Exact amount from the given denominations is not possible");
		else {
			System.out.println();
			System.out.println("Your payment approach to give minimum number of notes will be -:");
			for (int i = 0; i < notes.length; i++) {
				if (count[i] != 0)
					System.out.println(notes[i] + ":" + count[i]);
			}
		}
	}
}


