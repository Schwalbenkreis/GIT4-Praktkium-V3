public class LoadedDice extends Dice {

    @Override
    public int roll(){
        double r = Math.random();
        if (r < 0.5) {
            return 6;
        } else {
            return getRandomNumber(1,5);
        }
    }
}
