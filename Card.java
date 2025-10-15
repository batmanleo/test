public class Card {

// These are the attributes
// And what they are set to by default     
    int number;
    String suit;
    boolean facecard;
    String colour; 
    boolean played = false; 
    boolean inDiscardPile = false;
    boolean inDeck = true;
    boolean inAHand = false;
    boolean inPlayersHand = false;
    boolean cardNotOffical; //This one is if the card is made up like: 15 of plates, or -11 of dragons
    
// These are the methods

    public void playcard(){
        this.played=true;
        this.inDeck=false;
        this.inDiscardPile=false;
        this.inAHand=false;
        this.inPlayersHand=false;
    }

    public void discardcard(){
        this.inDiscardPile=true;
        this.inDeck=false;
        this.inAHand=false;
        this.inPlayersHand=false;
    }

    public void drawcard(){
        this.inDeck=false;
        this.inDiscardPile=false;
        this.inAHand=true;
        this.inPlayersHand=true;
    }

    public Card(int number, String suit){ //card constructor 

        this.number = number; 
        this.suit = suit;
        this.played = played;
        this.inDiscardPile = inDiscardPile;
        this.inDeck = inDeck;
        this.inAHand = inAHand;
        this.inPlayersHand = inPlayersHand; 




 }
}