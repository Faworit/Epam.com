package com.epam.encryption;

public class TableOfVizhiner {

    public static char[][] creatingTable(int countOfLetter, int startFromChar){
        char[][] tableOfVizhiner = new char[countOfLetter][countOfLetter];
        for(int i = 0; i < countOfLetter; i++){
            int letterOfAlphabet = i;
            for(int j = 0; j < countOfLetter; j++){
                if(letterOfAlphabet==countOfLetter){
                    letterOfAlphabet = 0;
                }
                tableOfVizhiner[i][j] = (char)(startFromChar + letterOfAlphabet);
                letterOfAlphabet++;
            }
        }
        return tableOfVizhiner;
    }
}
