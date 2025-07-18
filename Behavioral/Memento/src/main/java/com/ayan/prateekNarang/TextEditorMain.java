package com.ayan.prateekNarang;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker(); // History / StateMgmt
        editor.write("Hello World!");
        caretaker.saveState(editor);

        editor.write("Hello Everyone!");
        caretaker.saveState(editor);

        // Problem -> Undo the last write!
        caretaker.undo(editor);
        System.out.println(editor.getContent());
    }
}
