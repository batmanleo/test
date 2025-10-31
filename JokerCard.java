public class JokerCard extends Card{

    boolean IsWildCard;

    public JokerCard(String colour, boolean IsWildCard){
        
        super(0, "Jokers");
        this.IsWildCard = IsWildCard;
        this.colour = colour;
    }

    // this is for printing the card
    @Override
    public String toString() {
        if (IsWildCard){
            return colour + " " + "Joker";
        }
        return super.toString();
    }
}
