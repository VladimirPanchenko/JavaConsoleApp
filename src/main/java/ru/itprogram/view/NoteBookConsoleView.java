package ru.itprogram.view;

import ru.itprogram.entity.Note;
import ru.itprogram.entity.NoteBook;

public class NoteBookConsoleView extends NoteBookView {

    public void print(Note note) {
        System.out.println(note.toString());
    }

    public void print(Note ... notes) {
        for (Note note : notes) {
            System.out.println(note.toString());
        }
    }

    public void print(NoteBook noteBook) {
        System.out.println(noteBook.toString());
    }
}
