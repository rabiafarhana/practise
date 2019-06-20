/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author Rabia
 */
public class CardGame {

   

        private int handSize = 60;
	public Card[] cards = new Card[handSize];

	
        /**
         * These are delegation methods
         */
        public void generateHand()
        {
                int countCards = 0;
		for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                    }
                }//end outter for
        }//end method

    
}
