package com.epam.strings.exerciseA;

import com.epam.strings.WorkWithFile;
import com.epam.strings.WorkWithText;
import com.epam.strings.partOfText.Word;

import java.util.ArrayList;

public class ExerciseA {
    public static void main(String[] args) {
        ArrayList<String> wordsWithChange = new ArrayList<>();
        String changedWord;
        String text = WorkWithFile.ReadFromFile();
        ArrayList<Word> words = WorkWithText.parseToWordForExercizeA(text);
        for(int i = 0; i<words.size(); i++){
            Word word;
            word = words.get(i);
            String wordForChange = word.getWord();
            changedWord = WorkWithWords.changeSymbol(wordForChange);
            wordsWithChange.add(changedWord);
        }
        for (int i = 0; i < wordsWithChange.size(); i++) {
            System.out.println(wordsWithChange.get(i));
        }

    }
}
