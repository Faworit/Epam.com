package com.epam.encryption;

import java.io.*;


public class WorkWithFiles implements AutoCloseable {

    public String readFromFile(){
        String text = "";
        try (FileReader fileReader = new FileReader("FileToEncryption.txt")){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            text = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }
    public String readFromFileRu(){
        String text = "";
        try (FileReader fileReader = new FileReader("FileToEncryptionRu.txt")){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            text = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }

    public void writeInFile(String encrypted){
        try(Writer wtiteToFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Encrypted.txt")))) {
            wtiteToFile.write(encrypted);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFromEncryptedFile(){
        String text = "";
        try (FileReader fileReader = new FileReader("Encrypted.txt")){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            text = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }


    @Override
    public void close() throws Exception {

    }
}
