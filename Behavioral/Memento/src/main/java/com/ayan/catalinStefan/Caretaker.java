package com.ayan.catalinStefan;

import java.util.*;

public class Caretaker {
    ArrayList<Memento> mementoList = new ArrayList<>();

    public void saveState(Memento mem) {
        mementoList.add(mem);
    }

    public Memento restoreState(int index) {
        return mementoList.get(index);
    }
}
