package com.epam.encryption;

import javax.crypto.*;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) {
        String needToEncrypt;
        Encryption encrypter = null;
        WorkWithFiles workWithFiles = new WorkWithFiles();
        needToEncrypt = workWithFiles.readFromFile();
        try {
            SecretKey key = KeyGenerator.getInstance("DES").generateKey();
            encrypter = new Encryption(key);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        String encrypted = encrypter.encrypt(needToEncrypt);
        System.out.println(encrypted);
        workWithFiles.writeInFile(encrypted);
        String descrypted = encrypter.descrypt(encrypted);
        System.out.println(descrypted);
    }
}
