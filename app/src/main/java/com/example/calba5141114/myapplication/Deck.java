package com.example.calba5141114.myapplication;

import java.io.Serializable;
import java.util.ArrayList;

public class Deck implements Serializable {


    private static long serialVersionUID = 1l;
    private ArrayList<String> cardDeck;
    private String title;


    // constructor method for the Deck class.
    public Deck(ArrayList<String> cards, String title) {
        this.cardDeck = cards;
        this.title = title;
    }

    // getter for the card deck used in the game to be pulled during gameplay
    public ArrayList<String> getCardDeck() {
        return this.cardDeck;
    }

    // getter for the card deck to be used in the game to be pulled during gamePlay
    public String getTitle() {
        return this.title;
    }

    // allows the user to easily edit the title of a card deck within the game.
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }


}
