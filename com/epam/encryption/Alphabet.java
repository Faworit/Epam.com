package com.epam.encryption;

public enum Alphabet {
    LATIN(1, 26, 97),
    CYRILLIC(2, 33, 1072);
    private int id ;
    private int countOfLetter;
    private int startFromChar;

    Alphabet(int id, int countOfLetter, int startFromChar){
        this.id = id;
        this.countOfLetter = countOfLetter;
        this.startFromChar = startFromChar;
    }

    public int getId() {
        return id;
    }

    public int getCountOfLetter() {
        return countOfLetter;
    }

    public int getStartFromChar() {
        return startFromChar;
    }
}
