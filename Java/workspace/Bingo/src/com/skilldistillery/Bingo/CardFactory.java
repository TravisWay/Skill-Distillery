package com.skilldistillery.Bingo;

import java.util.Arrays;

public class CardFactory {

	private CardSpot[][] newCard = new CardSpot[5][5];
	

	
	public CardFactory() {

	}

	public void randomizeCard(){
		
			
			int multiplier = 15;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					 newCard[j][i] =new CardSpot((int)Math.ceil((Math.random())*15)+(i*15),false);
					 }
				
			}
			newCard[2][2] = new CardSpot(00,true);
			System.out.println(Arrays.deepToString(newCard[0])+"\n"+ Arrays.deepToString(newCard[1])+"\n"+Arrays.deepToString(newCard[2])+"\n"+Arrays.deepToString(newCard[3])+"\n"+Arrays.deepToString(newCard[4]));
			
//			return Card;
		}
}
