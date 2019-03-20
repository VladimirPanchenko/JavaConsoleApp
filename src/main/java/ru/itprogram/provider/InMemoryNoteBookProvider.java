package ru.itprogram.provider;

import ru.itprogram.entity.Note;
import ru.itprogram.entity.NoteBook;
import ru.itprogram.entity.NoteType;

import java.util.Date;
import java.util.Random;

public class InMemoryNoteBookProvider implements NoteBookProvider{
    private static InMemoryNoteBookProvider instance;
    private NoteBook[] noteBook;

    {
        noteBook = new NoteBook[] {
                new NoteBook(new Note[] {
                        new Note("Купить хлеба", new Date(), NoteType.NOTE),
                        new Note("Купить микросхемы", new Date(), NoteType.TASK),
                        new Note("Купить микроконтроллер", new Date(), NoteType.TASK),
                }),
                new NoteBook(new Note[] {
                        new Note("Продать хлеб", new Date(), NoteType.NOTE),
                        new Note("Продать микросхемы", new Date(), NoteType.TASK),
                        new Note("Продать микроконтроллер", new Date(), NoteType.TASK),
                }),
                new NoteBook(new Note[] {
                        new Note("Написать код", new Date(), NoteType.NOTE),
                        new Note("Придумать архитектуру", new Date(), NoteType.TASK),
                        new Note("Проверить идею", new Date(), NoteType.NOTE),
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
