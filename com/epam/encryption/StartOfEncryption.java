package com.epam.encryption;



public class StartOfEncryption {

    public static void main(String[] args) {
        int countOfLetter;
        int startFromChar;
        char[] keyFotLatin;
        char[] keyForCyrillic;
        char[] keyForAllText;
        char[][] tableOfVizhiner;
        String fromFile;
        String fromEncryptedFile;
        String encrypted;
        String descrypted;
        Alphabet latin = Alphabet.LATIN;
        Alphabet cyrillic = Alphabet.CYRILLIC;
        Encryption encrypter = new Encryption();
        WorkWithFiles workWithFiles = new WorkWithFiles();
        System.out.println("Check the alphabet please: \n 1. Latin \n 2. Cyrillic");
        int typeOfAlphabet = Check.isDigit();
        if(typeOfAlphabet == latin.getId()){
            fromFile = workWithFiles.readFromFile().toLowerCase();
            keyFotLatin = new char[]{'l', 'u', 'x'};
            countOfLetter = latin.countOfLetter;
            startFromChar = latin.startFromChar;
            keyForAllText = encrypter.generationFullKey(keyFotLatin, fromFile);
            tableOfVizhiner = TableOfVizhiner.creatingTable(countOfLetter, startFromChar);
        }
        else {
            fromFile = workWithFiles.readFromFileRu().toLowerCase();
            keyForCyrillic = new char[]{'ц', 'а', 'р', 'ь'};
            countOfLetter = cyrillic.countOfLetter;
            startFromChar = cyrillic.startFromChar;
            keyForAllText = encrypter.generationFullKey(keyForCyrillic, fromFile);
            tableOfVizhiner = TableOfVizhiner.creatingTable(countOfLetter, startFromChar);
        }
        encrypted = encrypter.encrypt(fromFile, keyForAllText, tableOfVizhiner, startFromChar);
        System.out.println(encrypted);
        workWithFiles.writeInFile(encrypted);
        fromEncryptedFile = workWithFiles.readFromEncryptedFile();
        descrypted = encrypter.descrypt(fromEncryptedFile, keyForAllText, tableOfVizhiner, countOfLetter, startFromChar);
        System.out.println(descrypted);
    }
}
