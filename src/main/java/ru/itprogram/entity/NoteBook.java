package ru.itprogram.entity;

import java.util.Arrays;

public class NoteBook {
    private Note[] arrNote;

    public NoteBook(Note[] arrNote) {
        this.arrNote = arrNote;
    }

    public Note[] getArrNote() {
        return arrNote;
    }

    public void setArrNote(Note[] arrNote) {
        this.arrNote = arrNote;
    }

    public int arrNoteLength() {
        return arrNote.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return Arrays.equals(arrNote, noteBook.arrNote);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arrNote);
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "arrNote=" + Arrays.toString(arrNote) +
                '}';
    }
}
