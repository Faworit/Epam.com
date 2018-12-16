package com.epam.Lotery;


import java.util.ArrayList;


public class Ticket {
    private boolean winner = false;
    private static int counter = 0;
    private int serialNumber;
    private ArrayList<PlayNumber> playingField;

    public Ticket(ArrayList<PlayNumber> playingField){
        this.serialNumber = counter++;
        this.playingField = playingField;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public ArrayList<PlayNumber> getPlayingField() {
        return playingField;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "serialNumber=" + serialNumber +
                ", playingField=" + playingField +
                '}';
    }
}
