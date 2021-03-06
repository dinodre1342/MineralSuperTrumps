package com.SuperTrumps.Testing;

import com.SuperTrumps.Deck;
import com.SuperTrumps.Player;

import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

        System.out.println("creating deck..."); //DEBUGGING PROGRESS MARKER
        Deck cardDeck = new Deck();

//        System.out.println("printing cards..."); //DEBUGGING PROGRESS MARKER
//        cardDeck.print();
//
//        System.out.println("printing select card..."); //DEBUGGING PROGRESS MARKER
//        cardDeck.print(5);
//
//        System.out.println("printing trumps..."); //DEBUGGING PROGRESS MARKER
//        cardDeck.print(59);cardDeck.print(58);cardDeck.print(57);
//        cardDeck.print(56);cardDeck.print(55);cardDeck.print(54);
//
//
//        System.out.println("printing deck size..."); //DEBUGGING PROGRESS MARKER
//        System.out.println(cardDeck.size());

        System.out.println("shuffling deck..."); //DEBUGGING PROGRESS MARKER
        Collections.shuffle(cardDeck.deckArray);

//        System.out.println("printing random card..."); //DEBUGGING PROGRESS MARKER
//        cardDeck.print(5);

        Player playerOne = new Player();
        playerOne.DealHand(playerOne, cardDeck);

//Display player hand
        System.out.println("Cards in hand " + playerOne.Hand.size());
        for (int i = 0; i < playerOne.Hand.size(); i++ )System.out.println(playerOne.Hand.get(i));

        //System.out.println("Cards left in deck " + cardDeck.size());

//Test Display player hands in main
//        System.out.println("Cards in " + playerName + " hand " + userPlayer.Hand.size());
//        System.out.println(userPlayer.Hand);
//        for (int j = 0; j < compPlayer.length; j++) {
//            System.out.println("Cards in " + compPlayer[j].playerName + " hand " + compPlayer[j].Hand.size());
//            System.out.println(userPlayer.Hand);        }
//        System.out.println("Cards left in deck " + cardDeck.size());
//



//        for (int i = 0; i < playerOne.Hand.size(); i++) {//display cards and players select card to play//NEEDS TO BE A METHOD TO CALL
//            System.out.println("Card #" + (i+1) + ":");
//            System.out.println(playerOne.Hand.get(i));
//        }
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose card to play");
        int cardToPlay = userInput.nextInt();
        System.out.println("Playing the card: \n" + playerOne.Hand.get(cardToPlay-1));
        playerOne.Hand.remove(cardDeck.deckArray.get(cardToPlay-1));

    }
}
