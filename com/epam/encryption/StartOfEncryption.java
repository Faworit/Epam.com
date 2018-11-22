package com.epam.encryption;

public class StartOfEncryption {

    public static void main(String[] args) {
        String encrypted;
        String descrypted;
        DataForEncryption dataForEncryption = new DataForEncryption();
        System.out.println("Check the alphabet please: \n 1. Latin \n 2. Cyrillic");
        int typeOfAlphabet = Check.isDigit();
        dataForEncryption.getData(typeOfAlphabet);
        encrypted = dataForEncryption.encryptionAndWrite();
        System.out.println(encrypted);
        descrypted = dataForEncryption.descryption();
        System.out.println(descrypted);




        /*int countOfLetter;
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
        RealizationOfEncryption encrypter = new RealizationOfEncryption();
        WorkWithFiles workWithFiles = new WorkWithFiles();
        System.out.println("Check the alphabet please: \n 1. Latin \n 2. Cyrillic");
        int typeOfAlphabet = Check.isDigit();
        if(typeOfAlphabet == latin.getId()){
            fromFile = workWithFiles.readFromFile().toLowerCase();
            keyFotLatin = new char[]{'l', 'u', 'x'};
            countOfLetter = latin.getCountOfLetter();
            startFromChar = latin.getStartFromChar();
            keyForAllText = encrypter.generationFullKey(keyFotLatin, fromFile);
            tableOfVizhiner = TableOfVizhiner.creatingTable(countOfLetter, startFromChar);
        }
        else {
            fromFile = workWithFiles.readFromFileRu().toLowerCase();
            keyForCyrillic = new char[]{'ц', 'а', 'р', 'ь'};
            countOfLetter = cyrillic.getCountOfLetter();
            startFromChar = cyrillic.getStartFromChar();
            keyForAllText = encrypter.generationFullKey(keyForCyrillic, fromFile);
            tableOfVizhiner = TableOfVizhiner.creatingTable(countOfLetter, startFromChar);
        }*/
        /*encrypted = encrypter.encrypt(fromFile, keyForAllText, tableOfVizhiner, startFromChar);
        System.out.println(encrypted);
        workWithFiles.writeInFile(encrypted);
        fromEncryptedFile = workWithFiles.readFromEncryptedFile();
        descrypted = encrypter.descrypt(fromEncryptedFile, keyForAllText, tableOfVizhiner, countOfLetter, startFromChar);
        System.out.println(descrypted);*/
    }
}
