package ru.itprogram.provider;

import ru.itprogram.entity.Note;
import ru.itprogram.entity.NoteBook;

import java.util.Date;
import java.util.Random;

public class NoteBookProvider {
    private static NoteBookProvider instance;
    private NoteBook[] noteBook;

    {
        noteBook = new NoteBook[] {
                new NoteBook(new Note[] {
                        new Note("Купить хлеба", new Date()),
                        new Note("Купить микросхемы", new Date()),
                        new Note("Купить микроконтроллер", new Date()),
                }),
                new NoteBook(new Note[] {
                        new Note("Продать хлеб", new Date()),
                        new Note("Продать микросхемы", new Date()),
                        new Note("Продать микроконтроллер", new Date()),
                }),
                new NoteBook(new Note[] {
                        new Note("Написать код", new Date()),
                        new Note("Придумать архитектуру", new Date()),
                        new Note("Проверить идею", new Date()),
                })
        };
    }

    private NoteBookProvider() {}

    public static NoteBookProvider getInstance() {
        if (instance == null) {
            instance = new NoteBookProvider();
        }
        return instance;
    }

    public NoteBook getOneRandomInstanceNoteBook() {
        int noteBookLength = noteBook.length;
        Random random = new Random(noteBookLength);
        return noteBook[random.nextInt()];
    }

    public Note getOneRandomInstanceNote() {
        NoteBook randomNoteBook = getOneRandomInstanceNoteBook();
        int noteLength = randomNoteBook.arrNoteLength();
        Random random = new Random(noteLength);
        return randomNoteBook.getArrNote()[random.nextInt()];
    }

    public NoteBook[] getNoteBook() {
        return noteBook;
    }
}
