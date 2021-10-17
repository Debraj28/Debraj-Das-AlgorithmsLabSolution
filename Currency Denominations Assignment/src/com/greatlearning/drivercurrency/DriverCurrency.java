package com.greatlearning.drivercurrency;

import java.util.Scanner;

import com.greatlearning.currencydenominations.Currency;
import com.greatlearning.currencydenominations.DenominationsSorting;

public class DriverCurrency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denomination");
		int totsize = sc.nextInt();
		int denomination[] = new int[totsize];
		System.out.println();
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < totsize; i++) {
			denomination[i] = sc.nextInt();
		}
		System.out.println();
		DenominationsSorting asc = new DenominationsSorting();
		asc.sort(denomination, 0, totsize - 1);
		System.out.println("Enter the amount you want to pay");
		int amt = sc.nextInt();
		Currency cy = new Currency();
		cy.Denominations(denomination, amt);

		sc.close();
	}

}
