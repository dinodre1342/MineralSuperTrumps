package com.SuperTrumps;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//  Start application
        System.out.println("Welcome to Mineral SuperTrumps!");

//  Edit player name
        Scanner input_playerName = new Scanner(System.in);
        System.out.println("Enter your name:");
        String playerName = input_playerName.next();

//  Choose number of players
        int numPlayers;
        do {Scanner input_numPlayers = new Scanner(System.in);
            System.out.println("Choose 2, 3 or 4 computer players. \nHow may opponents:");
            numPlayers = input_numPlayers.nextInt();
        }   while (numPlayers <2 || numPlayers >5);
        System.out.println("There are " + ((numPlayers)  + 1) + " players in this game.");

//  Start new game
        Game gameST = new Game(numPlayers);
        gameST.setUserPlayer(playerName);

//  Add players
        gameST.setComPlayers();
        gameST.showPlayers();

        //input check before starting rounds
        boolean playReady = false;
        do {
            System.out.println("Are you ready to play? y/n");
            Scanner input_playReady = new Scanner(System.in);
            if (input_playReady.next().charAt(0) == 'y') {
                playReady = true; }
        } while (playReady == false);

//  Randomise dealer
        gameST.randomiseDealer();

//  Deck is shuffled
        gameST.buildCardDeck();

//  Players dealt 8 cards
        gameST.dealPlayerHands();

//  Remaining cards make up the deck

//  First player plays card to start round
        gameST.startNewRound();

//  Next player plays higher card or passes

//  If player passes they must draw card from deck

//  If player passes they cannot continue in round

//  Player turns continue until one player not passed

//  If player plays 'Trump' card round is over

//  New round category is the 'Trump' category

//  Player who played 'Trump' begins next round

//  Rounds continue

//  First player with empty hand wins game


    }
}
