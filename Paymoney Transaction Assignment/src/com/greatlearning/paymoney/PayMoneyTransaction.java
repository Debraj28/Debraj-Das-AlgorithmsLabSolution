package com.greatlearning.paymoney;

public class PayMoneyTransaction {

	public int amountTransc(int transactions[], int target) {

		for (int i = 0; i < transactions.length; i++) {
			if (transactions[i] > target || transactions[i] == target)
				return i + 1;
			else
				target = target - transactions[i];
		}
		return -1;


	}
 }
