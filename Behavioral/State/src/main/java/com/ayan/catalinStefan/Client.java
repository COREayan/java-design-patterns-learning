package com.ayan.catalinStefan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        Game game = new Game();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        do {
            System.out.print("-- Please input command: ");
            input = reader.readLine().trim().toLowerCase();
            switch (input) {
                case "w": game.state.onWelcomeScreen();
                break;

                case "p": game.state.onPlaying();
                break;

                case "b": game.state.onBreak();
                break;

                case "e": game.state.onEndGame();
                break;

                default:
                    System.out.println("-- Unknown Command --");
                    break;
            }
        } while (input != "exit");
    }
}
