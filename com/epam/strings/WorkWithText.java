package com.epam.strings;

import com.epam.strings.partOfText.*;

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
            Matcher matcher = Pattern.compile("[^\",.!?\\s{1}]+").matcher(sentense);
            while (matcher.find()){
                Word word = new Word(matcher.group());
                words.add(word);
            }
        }

        return words;
    }

    static ArrayList<Lexeme> parseToLexemes(ArrayList<Sentence> sentences){
        ArrayList<Lexeme> lexemes = new ArrayList<>();
        for (int i = 0; i < sentences.size(); i++) {
            String sentense = sentences.get(i).getSentence();
            Matcher matcher = Pattern.compile("[^\\s]+").matcher(sentense);
            while (matcher.find()){
                Lexeme lexeme = new Lexeme(matcher.group());
                lexemes.add(lexeme);
            }
        }
        return lexemes;
    }

    static ArrayList<Symbol> parseToSymbols(String text){
        char[] arrayOfSymbols = text.toCharArray();
        ArrayList<Symbol> symbols = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            Symbol symbol = new Symbol(arrayOfSymbols[i]);
            symbols.add(symbol);
        }
        return symbols;
    }

    public static ArrayList<Word> parseToWordForExercizeA(String text){
        ArrayList<Word> words = new ArrayList<>();
        Matcher matcher = Pattern.compile("[^\",.!?\\s{1}]+").matcher(text);
        while (matcher.find()){
            Word word = new Word(matcher.group());
            words.add(word);
        }
        return words;
    }
}
