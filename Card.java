public class Card implements comparable<Card>  {

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
    int suitSort;
   

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
        this.colour = colour;

    if(this.suit == "spades") this.suitSort = 1;
    if(this.suit == "clubs") this.suitSort = 2;
    if(this.suit == "hearts") this.suitSort = 3;
    if(this.suit == "diamonds") this.suitSort = 4;
    if(this.suit == "jokers") this.suitSort = 5;
 }

 


 public String toString() {
     return number + " of " + suit + suitSort;
 }

 public int compareTo(Card o){
    if(o.suitSort == this.suitSort){ 
    return o.number-number; }
    return o.suitSort-this.suitSort;
 }
}
