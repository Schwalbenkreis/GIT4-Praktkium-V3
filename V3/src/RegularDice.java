public class RegularDice extends Dice {

    @Override
    public int roll(){
        return getRandomNumber(1,6);
    }
}
