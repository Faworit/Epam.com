package com.epam.strings;


import com.epam.strings.partOfText.*;

import com.epam.strings.partOfText.Paragraph;
import com.epam.strings.partOfText.Sentence;
import com.epam.strings.partOfText.Word;

import java.util.ArrayList;



public class Run {

    public static void main(String[] args) {
        String text = WorkWithFile.ReadFromFile();
        ArrayList<Paragraph> paragraphs;
        paragraphs = WorkWithText.parseToParagraph(text);
        System.out.println("Printing paragraphs");
        PartToPrint.printParagraphs(paragraphs);
        ArrayList<Sentence> sentences;
        sentences = WorkWithText.parseToSentence(paragraphs);
        System.out.println("Printing sentences");
        PartToPrint.printSentences(sentences);
        ArrayList<Word> words;
        words = WorkWithText.parseToWords(sentences);
        System.out.println("Printing words");
        PartToPrint.printWords(words);
        ArrayList<Symbol> symbols;
        symbols = WorkWithText.parseToSymbols(text);
        System.out.println("Printing symbols");
        PartToPrint.printSymbols(symbols);
        ArrayList<Lexeme> lexemes;
        lexemes = WorkWithText.parseToLexemes(sentences);
        System.out.println("Printing lexemes");
        PartToPrint.printLexemes(lexemes);
    }
}


