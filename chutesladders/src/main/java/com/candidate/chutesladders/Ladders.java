package com.candidate.chutesladders;

public class Ladders {

	int ladder( int loc){
		
		switch (loc) {
		case 1:
			return 38;
		case 4:
			return 14;	
		case 9:
			return 31;
		case 21:
			return 42;
		case 28:
			return 84;
		case 36:
			return 44;
		case 51:
			return 67;
		case 71:
			return 91;
		case 80:
			return 100;		
		default:
			return 0;
		}
		
	
	}
}