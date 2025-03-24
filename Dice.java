package assignment2;

public class Dice {

    private Die die1;
    private Die die2;

    public Dice(){
        die1 = new Die();
        die2 = new Die();
    }

    // Adds both die values together and returns int. Called in main.
    public int getFaceValue(){
        die1.roll();
        die2.roll();
        return die1.getFaceValue() + die2.getFaceValue();
    }
}
