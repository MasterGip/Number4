package ru.kfu.itis;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by mg on 11.02.15.
 */
public class Game implements Serializable{

    String winner;
    ArrayList<Gamer> gamers;
    ArrayList<ArrayList<String>> resultTable;

    Game(){
        resultTable = new ArrayList<ArrayList<String>>();
        gamers = new ArrayList<Gamer>();
        for(int i = 0; i < 10; i++){
            gamers.add(new Gamer(i+1));
        }
        play();


    }

    public void play(){
        resultTable = new ArrayList<ArrayList<String>>();
        ArrayList<String> ids = new ArrayList<String>();
        for(int i = 0; i < gamers.size(); i++){
            ids.add(gamers.get(i).getId() + "");

        }
        resultTable.add(ids);
        playRound(gamers);

//        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();

    }

    public void playRound(ArrayList<Gamer> gamersInGame){
        ArrayList<String> roundResult = new ArrayList<String>();
        ArrayList<Gamer> roundWinners = new ArrayList<Gamer>();
//        System.out.println(gamers.size());
        for(int i = 0; i < gamers.size(); i++){
            if(gamersInGame.contains(gamers.get(i))){

                roundResult.add(gamers.get(i).roll() + "");
//                System.out.println(gamers.get(i).getResult());
                if(roundWinners.size() == 0 || roundWinners.get(0).getResult() < gamers.get(i).getResult()){
                    roundWinners.clear();
                    roundWinners.add(gamers.get(i));
                }else{
                    if(roundWinners.get(0).getResult() == gamers.get(i).getResult()){
                        roundWinners.add(gamers.get(i));
                    }
                }
            }else{
                roundResult.add(" ");
//                System.out.println("!!");
            }
        }
        resultTable.add(roundResult);
        if(roundWinners.size() > 1) {
            playRound(roundWinners);
        }else{
            winner = "Игрок " + roundWinners.get(0).getId();
        }

    }

    public ArrayList<ArrayList<String>> getResult(){
        return resultTable;
    }

    public String getWinner(){
        return winner;
    }

}
