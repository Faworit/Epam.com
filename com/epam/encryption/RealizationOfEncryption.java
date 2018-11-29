package com.epam.encryption;



class RealizationOfEncryption {

    String charToString(char[] array){
        String textFromArray = "";
        for(int i=0; i<array.length; i++){
            textFromArray += Character.toString(array[i]);
        }
        return textFromArray;
    }

    char[] generationFullKey(char[] key, String fromFile){
        char[] text = fromFile.toCharArray();
        char[] fullKey = new char[text.length];
        int forKeyIncriment = 0;
        for(int i=0; i<fullKey.length; i++){
            fullKey[i] = key[forKeyIncriment];
            forKeyIncriment++;
            if(forKeyIncriment==2){
                forKeyIncriment = 0;
            }
        }
        return fullKey;
    }

    String encrypt(String textFromFile, char[] key, char[][] tableOfVizhiner, int startFromChar){
        char[] text = textFromFile.toCharArray();
        char[] encrypted = new char[text.length];
        String encryptedText;
        int horizontal;
        int vertical;
        int notAlphabetSymbol;
        int firstPunctuationMark = 31;
        int lastPunctuationMark = 66;
        int forIncryptionPunctuationMarks = 5;
        for(int i=0; i<text.length; i++){
            notAlphabetSymbol = text[i];
            if(notAlphabetSymbol<lastPunctuationMark && notAlphabetSymbol>firstPunctuationMark || notAlphabetSymbol==10){
                notAlphabetSymbol *= forIncryptionPunctuationMarks;
                encrypted[i] = (char)notAlphabetSymbol;
            }
            else {
                horizontal = (int)key[i] - startFromChar;
                vertical = (int)text[i] - startFromChar;
                encrypted[i] = tableOfVizhiner[vertical][horizontal];
            }
        }
        encryptedText = charToString(encrypted);
        return encryptedText;
    }

    String descrypt(String encrypted, char[] key, char[][] tableOfVizhiner, int countOfLetter, int startFromChar){
        char[] encryptedChars = encrypted.toCharArray();
        char[] descrypted = new char[encryptedChars.length];
        String descryptedText;
        int horizontal;
        int vertical;
        int firstPunctuationMark = 31;
        int lastPunctuationMark = 66;
        int forDescryptionPunctuationMarks = 5;
        for(int i = 0; i<encryptedChars.length; i++){
            int numOfSymbol = encryptedChars[i]/forDescryptionPunctuationMarks;
            if(numOfSymbol<lastPunctuationMark && numOfSymbol>firstPunctuationMark || numOfSymbol==10){
              descrypted[i] = (char)numOfSymbol;
            }
            else {
                horizontal = key[i] - startFromChar;
                vertical = encryptedChars[i] - startFromChar;
                if (horizontal > vertical) {
                    descrypted[i] = tableOfVizhiner[countOfLetter + (vertical - horizontal)][0];
                } else {
                    descrypted[i] = tableOfVizhiner[vertical - horizontal][0];
                }
            }
        }
        descryptedText = charToString(descrypted);
        return descryptedText;
    }
}

