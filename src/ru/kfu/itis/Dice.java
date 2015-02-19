package ru.kfu.itis;

/**
 * Created by mg on 11.02.15.
 */
public class Dice {
    private int numberOnDice;

    Dice(){
        roll();
    }

    public int getNumberOnDice(){
        return numberOnDice;
    }

    public int roll(){
        numberOnDice = (int) (Math.random()*6) + 1;
        return numberOnDice;
    }
}
