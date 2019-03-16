package ru.itprogram.view;

import ru.itprogram.entity.Note;
import ru.itprogram.entity.NoteBook;

public class NoteBookConsoleView {

    public NoteBookConsoleView() {
    }

    public static void print(Note note) {
        System.out.println(note.toString());
    }

    public static void print(Note ... notes) {
        for (Note note : notes) {
            System.out.println(note.toString());
        }
    }

    public static void print(NoteBook noteBook) {
        System.out.println(noteBook.toString());
    }

    public static void print(NoteBook[] noteBooks) {
        for (NoteBook noteBook : noteBooks) {
            System.out.println(noteBook.toString());
        }
    }
}
