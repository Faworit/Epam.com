package com.epam.encryption;

import java.io.*;


class WorkWithFiles implements AutoCloseable {

    String readFromFile(){
        String text = "";
        try (FileReader fileReader = new FileReader("src\\com\\epam\\encryption\\FileToEncryption.txt")){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            text = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }
    String readFromFileRu(){
        String text = "";
        try (FileReader fileReader = new FileReader("src\\com\\epam\\encryption\\FileToEncryptionRu.txt")){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            text = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }

    void writeInFile(String encrypted){
        try(Writer wtiteToFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Encrypted.txt")))) {
            wtiteToFile.write(encrypted);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String readFromEncryptedFile(){
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
    public void close() {

    }
}
