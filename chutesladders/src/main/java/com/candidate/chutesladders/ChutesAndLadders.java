package com.candidate.chutesladders;
import java.util.*;  

public class ChutesAndLadders {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		System.out.println("Hello Welcome to Chetes And Ladders Game");
		System.out.println("Enter 1 for 2 Player Game 2 for 4 Player");
		int s =  Integer.parseInt( in.nextLine());
	
		switch (s) {
		case 1:
			System.out.println("Welcome to 2 Player Game");
			TwoPlayers p = new TwoPlayers();
			p.gameStart();
			break;
		case 2:
			System.out.println("Welcome to 4 Player Game");
			FourPlayers p4 = new FourPlayers();
			p4.gameStart();
			break;
		default:
			break;
		}
		
in.close();	
		

	}

}
