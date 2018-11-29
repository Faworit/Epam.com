package com.epam.strings;

import com.epam.strings.partOfText.Paragraph;
import com.epam.strings.partOfText.Sentence;
import com.epam.strings.partOfText.Symbol;
import com.epam.strings.partOfText.Word;

import java.util.ArrayList;

public class Run {

    public static void main(String[] args) {
        String text = WorkWithFile.ReadFromFile();
        ArrayList<Paragraph> paragraphs;
        paragraphs = WorkWithText.parseToParagraph(text);
       /* for(int i=0; i<paragraphs.size(); i++) {

            Paragraph paragraph = paragraphs.get(i);
            String str = paragraph.getParagraph();
            System.out.println("    " + str);
        }*/
        ArrayList<Sentence> sentences;
        sentences = WorkWithText.parseToSentence(paragraphs);
        /*for(int i = 0; i<sentences.size(); i++){
            Sentence sentence = sentences.get(i);
            String str = sentence.getSentence();
            System.out.println(str);
        }*/
       ArrayList<Word> words;
       words = WorkWithText.parseToWords(sentences);
        /*for(int i = 0; i<words.size(); i++) {
            Word word = words.get(i);
            String str = word.getWord();
            System.out.println(str);
        }*/
        ArrayList<Symbol> symbols;
        symbols = WorkWithText.parseToSymbols(words);
        for(int i = 0; i<symbols.size(); i++) {
            Symbol symbol = symbols.get(i);
            char ch = symbol.getSymbol();
            System.out.println(ch);
        }
    }
}
