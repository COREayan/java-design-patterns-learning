package com.ayan.catalinStefan;

public class Game {

    public State state = new WelcomeScreenState(this);

    public void changeState(State state) {
        this.state = state;
    }
}
