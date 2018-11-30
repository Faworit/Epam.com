package com.epam.strings;

import com.epam.strings.partOfText.Paragraph;
import com.epam.strings.partOfText.Sentence;
import com.epam.strings.partOfText.Symbol;
import com.epam.strings.partOfText.Word;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
        ArrayList<String> str = new ArrayList<>();
        Paragraph paragraph;
        for(int i = 0; i<paragraphs.size(); i++){
          paragraph = paragraphs.get(i);
          String par = paragraph.getParagraph();
          Matcher matcher = Pattern.compile("([^.!?]+[.!?])").matcher(par);
          while (matcher.find()){
              Sentence sentence = new Sentence(matcher.group());
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

    public static ArrayList<Word> parseToWordForExercizeA(String text){
        ArrayList<Word> words = new ArrayList<>();
        String[] arrayOfWords = text.split("\\b");
        for(int i = 0; i<arrayOfWords.length; i++){
            Word word = new Word(arrayOfWords[i]);
            words.add(word);
        }
        return words;
    }


}
