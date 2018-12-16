package com.epam.Lotery;

import java.util.ArrayList;

public class GameStart {
    public static void main(String[] args) {
        int maxValue = 36;
        int maxNumbersInTicket = 6;
        boolean haveWinner = false;
        Game game = new Game();
        ArrayList<PlayNumber> playNumbers;
        ArrayList<com.epam.Lotery.Ticket> tickets = new ArrayList<>();
        Generator generator = new Generator();
        playNumbers = generator.numberCreation(maxValue);
        for (int i = 0; i < 100000; i++) {
            Ticket ticket = generator.tickets(playNumbers, maxNumbersInTicket);
            tickets.add(ticket);
        }
       while(!haveWinner){
            game.getRandomPlayNumber(playNumbers, tickets);
            haveWinner = game.winnerCheck(tickets);
        }

    }
}
