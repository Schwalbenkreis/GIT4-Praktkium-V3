public class ChaosDice extends Dice{

    private int sides;

    @Override
    public int roll(){
        sides = (int)(Math.random() * 17)+4;
        return getRandomNumber(1, sides);
    }    
}
