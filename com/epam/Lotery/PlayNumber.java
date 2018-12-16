package com.epam.Lotery;

public class PlayNumber {
    private int number;
    private boolean isPlay;

    public PlayNumber(int number, boolean isPlay) {
        this.number = number;
        this.isPlay = isPlay;
    }

    public int getNumber() {
        return number;
    }

    public boolean isPlay() {
        return isPlay;
    }

    public void setPlay(boolean play) {
        isPlay = play;
    }

    @Override
    public String toString() {
        return "PlayNumber{" +
                "number=" + number +
                ", isPlay=" + isPlay +
                '}';
    }
}
