public class MultisidedDice extends Dice {

    private final int sides;

    public MultisidedDice(int sides){
        if (sides < 4 || sides > 20) {
            throw new IllegalArgumentException("Seitenanzahl muss zwischen 4 und 20 liegen.");
        }
        this.sides = sides;
    }

    @Override
    public int roll(){
        return getRandomNumber(1, sides);
    }
}
