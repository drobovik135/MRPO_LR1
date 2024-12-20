package org.example.lobby;

import org.example.games.Game;
import org.example.games.NokGame;

import java.util.Scanner;

public class LobbyImpl implements Lobby {
    String name = "";
    Scanner scan;

    private Game selector(Integer i){
        if(i == 1){
            return new NokGame();
        }

        return null;
    }

    private void gameSelect(){
        System.out.println("Pick the game: 1 - NokGame");
        Integer select = scan.nextInt();
        Game game = selector(select);
        game.start();
    }

    public LobbyImpl() {
        this.scan = new Scanner(System.in);
    }

    @Override
    public void start() {
        System.out.println("Welcome to the Brain Games! May I have your name?");
        name = scan.nextLine();
        System.out.printf("Hello, %s!", name);
        body();
    }

    @Override
    public void body() {
        while(true){
            gameSelect();
        }
    }
}
