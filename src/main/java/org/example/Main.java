package org.example;

import org.example.lobby.Lobby;
import org.example.lobby.LobbyImpl;

public class Main {
    public static void main(String[] args) {
        Lobby lobby = new LobbyImpl();
        lobby.start();
    }
}