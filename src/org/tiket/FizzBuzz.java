package org.tiket;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("inserisci un numero per far partire il gioco");
		int userNum = in.nextInt();
		
		if(userNum <= 5) {
			System.out.println("il numero deve essere maggiore di 5");
			return;
		}
		in.close();
		for(int i = 1; i <= userNum; i++ ) {
			
			String number = null;
			if((i % 3 == 0) && (i % 5 == 0)) {
				number = "FIZBUZZ";
				//System.out.println(number);
			} else if (i % 5 == 0 ) {
				number = "BUZZ";
			}else if (i % 3 == 0) {
				number = "FIZZ";
			}else {
				number = ""+ i;
			}
		 System.out.println(number);
		}
	}
}
