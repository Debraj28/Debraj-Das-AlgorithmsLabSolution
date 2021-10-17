package com.greatlearning.paymain;

import java.util.Scanner;

import com.greatlearning.paymoney.PayMoneyTransaction;

public class DriverPayMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PayMoneyTransaction pmt = new PayMoneyTransaction();
		System.out.println("Enter the size of transaction array: ");
		int size = sc.nextInt();
		int transactions[] = new int[size];
		System.out.println("Enter the value of Transactions: ");
		for (int i = 0; i < size; i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the total number of targets that needs to be achieved: ");
		int no_of_targets = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= no_of_targets; i++) {
			System.out.println("Enter the value of target " + i);
			int target = sc.nextInt();
			int count = pmt.amountTransc(transactions, target);
			if (count == -1) {
				System.out.println("Target is not acheived");
				System.out.println();
			} else {
				System.out.println("Target acheived after " + count + " transactions");
				System.out.println();
			}
		}
		sc.close();
	}
}

