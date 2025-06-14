package com.ayan.prateekNarang.Problem;

import java.util.*;

public class GameBoard {
    private List<GamePiece> pieces = new ArrayList<>();

    public void addPiece(GamePiece piece) {
        pieces.add(piece);
    }

    public List<GamePiece> getPieces() {
        return pieces;
    }

    public void showBoardState() {
        System.out.println("Current Board State");
        for (GamePiece piece : pieces) {
            System.out.println(piece);
        }
    }
}
