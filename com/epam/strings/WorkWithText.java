package com.epam.strings;

import com.epam.strings.partOfText.Paragraph;
import com.epam.strings.partOfText.Sentence;
import com.epam.strings.partOfText.Symbol;
import com.epam.strings.partOfText.Word;

import java.util.ArrayList;


public class WorkWithText {

    static ArrayList<Paragraph> parseToParagraph(String text){
        ArrayList<Paragraph> paragraphs = new ArrayList<>();
        String[] arrayOfParagraps = text.split("\\s{4}(\\s)");
        for(String s : arrayOfParagraps){
            Paragraph paragraph = new Paragraph(s);
            paragraphs.add(paragraph);
        }
        return paragraphs;
    }

    static ArrayList<Sentence> parseToSentence(ArrayList<Paragraph> paragraphs){
        ArrayList<Sentence> sentences = new ArrayList<>();
        for(int i = 0; i<paragraphs.size(); i++){
           String paragraph = paragraphs.get(i).getParagraph();
           String[] arrayOfSentences = paragraph.split("\\.(\\n)");
           for(int z = 0; z<arrayOfSentences.length; z++){
               arrayOfSentences[z].split(" ");
               Sentence sentence = new Sentence(arrayOfSentences[z]);
               sentences.add(sentence);
           }
        }
        return sentences;
    }

    static ArrayList<Word> parseToWords(ArrayList<Sentence> sentences){
        ArrayList<Word> words = new ArrayList<>();
        for (int i = 0; i < sentences.size(); i++) {
            String sentense = sentences.get(i).getSentence();
            String[] arrayOfWords = sentense.split("\\b(\\n)");
            for (int z = 0; z < arrayOfWords.length; z++) {
                Word word = new Word(arrayOfWords[z]);
                words.add(word);
            }
        }

        return words;
    }

    static ArrayList<Symbol> parseToSymbols(ArrayList<Word> words){
        ArrayList<Symbol> symbols = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i).getWord();
            char[] arrayOfSymbols = word.toCharArray();
            for (int z = 0; z < arrayOfSymbols.length; z++) {
                Symbol symbol = new Symbol(arrayOfSymbols[z]);
                symbols.add(symbol);
            }
        }
        return symbols;
    }



}
