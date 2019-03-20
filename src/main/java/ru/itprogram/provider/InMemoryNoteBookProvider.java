package ru.itprogram.provider;

import ru.itprogram.entity.Note;
import ru.itprogram.entity.NoteBook;

import java.util.Date;
import java.util.Random;

public class InMemoryNoteBookProvider implements NoteBookProvider{
    private static InMemoryNoteBookProvider instance;
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

    private InMemoryNoteBookProvider() {}

    public static InMemoryNoteBookProvider getInstance() {
        if (instance == null) {
            instance = new InMemoryNoteBookProvider();
        }
        return instance;
    }

    @Override
    public NoteBook getOneRandomInstanceNoteBook() {
        int noteBookLength = noteBook.length;
        Random random = new Random();
        return noteBook[random.nextInt(noteBookLength)];
    }

    @Override
    public Note getOneRandomInstanceNote() {
        NoteBook randomNoteBook = getOneRandomInstanceNoteBook();
        int noteLength = randomNoteBook.arrNoteLength();
        Random random = new Random();
        return randomNoteBook.getArrNote()[random.nextInt(noteLength)];
    }

    @Override
    public NoteBook[] getNoteBook() {
        return noteBook;
    }
}
