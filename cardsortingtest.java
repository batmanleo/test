import java.util.*;

public class cardsortingtest {

public static void main(String[] args) {
ArrayList<Card> deck; 
deck = new ArrayList<Card>();

     // This makes 3 new cards and sets the number and suit
    Card card1;
    Card card2;
    Card card3;
    Card card4;
  


for(int x = 0; x < 13; x++){
card1 = new Card(x+1, "spades");
card2 = new Card(x+1, "clubs");
card3 = new Card(x+1, "hearts");
card4 = new Card(x+1, "diamonds");

    deck.add (card1);
    deck.add (card2);
    deck.add (card3);
    deck.add (card4);

}

Collections.shuffle(deck);

System.out.println("unsorted deck" + deck);

Collections.sort(deck);

System.out.println("sorted deck" + deck);
}
}
