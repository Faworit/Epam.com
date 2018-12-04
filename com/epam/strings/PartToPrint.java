package com.epam.strings;

import com.epam.strings.partOfText.*;
import com.epam.strings.partOfText.Paragraph;
import com.epam.strings.partOfText.Sentence;
import com.epam.strings.partOfText.Word;


import java.util.ArrayList;


public class PartToPrint {

    static void printParagraphs(ArrayList<Paragraph> paragraphs){
        for (int i = 0; i < paragraphs.size(); i++) {
            Paragraph paragraph = paragraphs.get(i);
            String paragraphsText = paragraph.getParagraph();
            System.out.println("    " + paragraphsText);
        }
    }

    static void printSentences(ArrayList<Sentence> sentences){
        for(int i = 0; i<sentences.size(); i++){
            Sentence sentence = sentences.get(i);
            String sentencesText = sentence.getSentence();
            System.out.println(sentencesText);
        }
    }

    static void printLexemes(ArrayList<Lexeme> lexemes){
        for (int i = 0; i < lexemes.size(); i++) {
            Lexeme lexeme = lexemes.get(i);
            String lexemeText = lexeme.getLexeme();
            System.out.println(lexemeText);
        }
    }

    static void printWords(ArrayList<Word> words){

        for (int i = 0; i < words.size(); i++) {
            Word word = words.get(i);
            String wordText = word.getWord();
            System.out.println(wordText);
        }
    }

    static void printSymbols(ArrayList<Symbol> symbols){
        for (int i = 0; i < symbols.size(); i++) {
            Symbol symbol = symbols.get(i);
            char ch = symbol.getSymbol();
            System.out.println(ch);
        }
    }
}
