package com.epam.encryption;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.*;

import static javax.crypto.Cipher.getInstance;

public class Encryption {
    Cipher ecipher;
    Cipher dcipher;
    public Encryption(SecretKey key) {
        try {
            ecipher = getInstance("DES");
            dcipher = getInstance("DES");
            ecipher.init(Cipher.ENCRYPT_MODE, key);
            dcipher.init(Cipher.DECRYPT_MODE, key);
        } catch (InvalidKeyException e){
            e.printStackTrace();
        } catch (NoSuchPaddingException e){
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {


        }
    }

    public String encrypt(String str) {
        String encrypted = "";
        try {
            byte[] textUTF8;
            byte[] enc;
            textUTF8 = str.getBytes();
            enc = ecipher.doFinal(textUTF8);
            encrypted = new sun.misc.BASE64Encoder().encodeBuffer(enc);
        }
        catch (BadPaddingException e){
            e.printStackTrace();
        }
        catch (IllegalBlockSizeException e){
            e.printStackTrace();
        }

        return encrypted;
    }

    public String descrypt(String str){
        String descrypted = "";
        byte[] dec;
        byte[] textUTF8;
        try {
            dec = new sun.misc.BASE64Decoder().decodeBuffer(str);
            textUTF8 = dcipher.doFinal(dec);
            descrypted = new String(textUTF8, "UTF8");
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return descrypted;
    }
}
