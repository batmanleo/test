public class ChangeableCard extends Card{

    boolean IsChangeable;

    public ChangeableCard(int number, String suit, boolean IsChangeable){
        
        super(number,suit);
        this.IsChangeable = IsChangeable;
       
    }
    //this method changes the card 
public void changecard(int number, String suit) {
    if (IsChangeable = true) {
        this.number = number;
        this.suit = suit;
    }
}
    // this is for printing the card
    @Override
    public String toString() {
        
        return super.toString();
    }
}
