public class cardgame {
public static void main(String[] args) {
    Card tempCard;
    Deck deck;
    Cardplayer player1;
    Cardplayer player2;
    Cardplayer player3;
    Cardplayer player4;
    Cardplayer player5;
    //this makes the deck and players and shuffles the deck
       deck = new Deck();
       deck.shuffle();
       player1 = new Cardplayer();
       player2 = new Cardplayer();
       player3 = new Cardplayer();
       player4 = new Cardplayer();
       player5 = new Cardplayer();
    //this draws the cards for each player
       for(int x=0; x<5; x++){
        player1.addcard(deck.draw());
        player2.addcard(deck.draw());
        player3.addcard(deck.draw());
        player4.addcard(deck.draw());
        player5.addcard(deck.draw());
       }
    //this prints each players hand and what score they got
System.out.println("player1's hand is:");       
System.out.println(player1.printhand());
System.out.println("Score: " + player1.scorePoker());
System.out.println("");

System.out.println("player2's hand is:");       
System.out.println(player2.printhand());
System.out.println("Score: " + player2.scorePoker());
System.out.println("");

System.out.println("player3's hand is:");       
System.out.println(player3.printhand());
System.out.println("Score: " + player3.scorePoker());
System.out.println("");

System.out.println("player4's hand is:");       
System.out.println(player4.printhand());
System.out.println("Score: " + player4.scorePoker());
System.out.println("");

System.out.println("player5's hand is:");       
System.out.println(player5.printhand());
System.out.println("Score: " + player5.scorePoker());
System.out.println("");
    //this compares the score of every player's hand to each other and tells who won
if (player1.scorePoker() >= player2.scorePoker() & player1.scorePoker() >= player3.scorePoker() & player1.scorePoker() >= player4.scorePoker() & player1.scorePoker() >= player5.scorePoker()){
    System.out.println("player1 wins!");
}

if (player2.scorePoker() >= player1.scorePoker() & player2.scorePoker() >= player3.scorePoker() & player2.scorePoker() >= player4.scorePoker() & player2.scorePoker() >= player5.scorePoker()){
    System.out.println("player2 wins!");
}

if (player3.scorePoker() >= player2.scorePoker() & player3.scorePoker() >= player1.scorePoker() & player3.scorePoker() >= player4.scorePoker() & player3.scorePoker() >= player5.scorePoker()){
    System.out.println("player3 wins!");
}

if (player4.scorePoker() >= player2.scorePoker() & player4.scorePoker() >= player3.scorePoker() & player4.scorePoker() >= player1.scorePoker() & player4.scorePoker() >= player5.scorePoker()){
    System.out.println("player4 wins!");
}

if (player5.scorePoker() >= player2.scorePoker() & player5.scorePoker() >= player3.scorePoker() & player5.scorePoker() >= player4.scorePoker() & player5.scorePoker() >= player1.scorePoker()){
    System.out.println("player5 wins!");
}

   }
}
