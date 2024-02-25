package com.gk.with.exception;

//[10,30,43,67,34,454,24,87]
//check whether 43 number is present or not in this array or print resent or not.

public class GkWithBreakStatement {

	public static void main(String[] args) {
		int[] array = { 10, 30, 43, 67, 34, 454, 24, 87 };
		int num = 43;

		GkWithBreakStatement g = new GkWithBreakStatement();
		g.printNumber(array, num);

	}

	void printNumber(int[] arr, int a) {
		boolean isNumberPresent = false;

		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("********");

			if (arr[i] == a) {

				isNumberPresent = true;
				break;
				// If we get our number then break statement stop searching and jump outside of
				// loop.
			}
		}

		if (isNumberPresent) {
			System.out.println("present");
		} else {
			System.out.println("absent");
		}
	}

}
