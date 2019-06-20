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
public class Card {
    /*There are four principles i used in this Excercise
    
    1.Encapsulation
    2.Deligation
    3.Cohesion
    4.Coupling
    
    */
        public enum Suit {RED, BLUE, GREEN, YELLOW};
        public enum Value{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD};
        private final Suit suit;
        private final Value value;
        
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
	}

	
	public Suit getSuit() {
		return this.suit;
        }

    /**
     *These features are use to reuse my code
     * Assciation, Encapsulation, Aggregation.
     */
    public Value getValue() {
        return value;
    }

}