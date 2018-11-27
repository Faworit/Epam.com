package com.epam.strings.partOfText;

import java.util.ArrayList;

public class Symbol {
    private char symbol;
    private ArrayList<Symbol> symbols = new ArrayList<>();

    Symbol(char symbol){
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public ArrayList<Symbol> getSymbols() {
        return symbols;
    }
}
