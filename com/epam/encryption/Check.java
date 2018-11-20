package com.epam.encryption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Check {
    public static int isDigit(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int typeOfAlphabet;
        boolean checkString;
        String forCheck = "";
        do{
            try{
                forCheck = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            checkString = forCheck.matches("[1-2]");
            if(!checkString){
                System.out.println("You entered not correct data");
            }
        }
        while(!checkString);
        typeOfAlphabet = Integer.parseInt(forCheck);
        return typeOfAlphabet;
    }

}
