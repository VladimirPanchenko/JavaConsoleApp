package ru.itprogram.view;

import ru.itprogram.entity.Note;
import ru.itprogram.entity.NoteBook;

public abstract class NoteBookView {
    public abstract void print(Note note);

    public void print(NoteBook[] noteBooks) {
        for (NoteBook noteBook : noteBooks) {
            System.out.println(noteBook.toString());
        }
    }
}
