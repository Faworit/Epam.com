package com.epam.strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WorkWithFile {

    public static String ReadFromFile(){
        StringBuilder stringBuilder = new StringBuilder();
        String text;
        try(FileReader fileReader = new FileReader("src\\com\\epam\\strings\\Text.txt")) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((text = bufferedReader.readLine()) !=null){
                stringBuilder.append(text + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        text = stringBuilder.toString();
        return text;
    }
}
