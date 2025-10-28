public class JokerCard extends Card{

    boolean IsWildCard;

    public JokerCard(String suit, boolean IsWildCard){
        
        super(0,suit);
        this.IsWildCard = IsWildCard;
       
    }

    // this is for printing the card
    @Override
    public String toString() {
        if (IsWildCard){
            return suit + " " + "Joker";
        }
        return super.toString();
    }
}
