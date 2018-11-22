package com.epam.encryption;

 class DataForEncryption {
    private int countOfLetter;
    private int startFromChar;
    private char[] keyForAllText;
    private char[][] tableOfVizhiner;
    private String fromFile;
    private Alphabet latin = Alphabet.LATIN;
    private Alphabet cyrillic = Alphabet.CYRILLIC;
    private RealizationOfEncryption encrypter = new RealizationOfEncryption();
    private WorkWithFiles workWithFiles = new WorkWithFiles();

    void getData(int typeOfAlphabet){
        char[] keyFotLatin;
        char[] keyForCyrillic;

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
        }
    }

    String encryptionAndWrite(){
        String encrypted;
        encrypted = encrypter.encrypt(fromFile, keyForAllText, tableOfVizhiner, startFromChar);
        workWithFiles.writeInFile(encrypted);
        return encrypted;
    }

    String descryption(){
        String fromEncryptedFile;
        String descrypted;
        fromEncryptedFile = workWithFiles.readFromEncryptedFile();
        descrypted = encrypter.descrypt(fromEncryptedFile, keyForAllText, tableOfVizhiner, countOfLetter, startFromChar);
        return descrypted;
    }
}
