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
    }
}
