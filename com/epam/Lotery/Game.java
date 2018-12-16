package com.epam.Lotery;

import java.util.ArrayList;
import java.util.Collections;


public class Game {

    public void getRandomPlayNumber(ArrayList<PlayNumber> playNumbers, ArrayList<Ticket> tickets){
        Collections.shuffle(playNumbers);
        PlayNumber playNumber = playNumbers.get(0);
        System.out.println(playNumber);
        checkInAllTickets(playNumber, tickets);
        playNumbers.remove(0);
    }

    private Boolean checkInAllTickets(PlayNumber playNumber, ArrayList<Ticket> tickets){
        boolean winner = false;
        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            ArrayList<PlayNumber> playNumbers = ticket.getPlayingField();
            for (int j = 0; j < playNumbers.size(); j++) {
                int countOfConcurrency = 0;
                if(playNumber.equals(playNumbers.get(j))){
                    PlayNumber playNumberFromTicket = playNumbers.get(j);
                    playNumberFromTicket.setPlay(true);
                }
                countOfConcurrency++;
                if(countOfConcurrency==6){
                    winner = true;
                }
            }
        }
        return winner;
    }

    public Boolean winnerCheck(ArrayList<Ticket> tickets){
        boolean winner = false;
        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            int countOfConcurrency = 0;
            ArrayList<PlayNumber> playNumbers = ticket.getPlayingField();
            for (int j = 0; j < playNumbers.size(); j++) {

                PlayNumber playNumberFromTicket = playNumbers.get(j);
                if(playNumberFromTicket.isPlay() == true){
                    countOfConcurrency++;
                }
                if(countOfConcurrency==6){
                    System.out.println("We have a winner!!! It's ticket with serial number: " + ticket.getSerialNumber());
                    winner = true;
                }
            }
        }
        return winner;
    }
}
