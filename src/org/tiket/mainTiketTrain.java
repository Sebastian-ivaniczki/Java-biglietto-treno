package org.tiket;

import java.util.Scanner;

public class mainTiketTrain {
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("quanti chilometri vuoi percorrere?");
		int userKm = in.nextInt();
		//System.out.println(userKm);
		System.out.println("quanti anni hai?");
		int userAge = in.nextInt();
		//System.out.println(userAge);
		float tiketPrice = 0.0f; 
		
		if(userAge <= 18) {
			tiketPrice = (userKm * 0.21f) * 80 / 100 ;
		} else if (userAge >= 65) {
			tiketPrice = (userKm * 0.21f) * 60 / 100 ;
		}else {
			 tiketPrice = userKm * 0.21f;
		}
		
		System.out.println("il prezzo del biglietto in base hai kilometri è " + tiketPrice+"€");
		
		
		
	}
}

