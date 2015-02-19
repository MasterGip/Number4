package ru.kfu.itis;

/**
 * Created by mg on 11.02.15.
 */
public class Gamer {

    private int id;
    private Dice[] dices;

    Gamer(){
        id = 1;
        dices = new Dice[2];
        dices[0] = new Dice();
        dices[1] = new Dice();
    }

    Gamer(int ident){
        id = ident;
        dices = new Dice[2];
        dices[0] = new Dice();
        dices[1] = new Dice();
    }

    public int getResult(){
        return dices[0].getNumberOnDice() + dices[1].getNumberOnDice();
    }

    public int roll(){
        return dices[0].roll() + dices[1].roll();
    }

    public int getId(){
        return id;
    }

}
