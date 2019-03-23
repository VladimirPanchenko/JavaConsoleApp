package ru.itprogram.provider;

import ru.itprogram.entity.Note;
import ru.itprogram.entity.NoteBook;
import ru.itprogram.entity.NoteType;

import java.time.LocalDateTime;
import java.util.Random;

public class InMemoryNoteBookProvider implements NoteBookProvider{
    private static InMemoryNoteBookProvider instance;
    private NoteBook[] noteBook;

    {
        noteBook = new NoteBook[] {
                new NoteBook(new Note[] {
                        new Note("Купить хлеба", LocalDateTime.now(), NoteType.NOTE),
                        new Note("Купить микросхемы", LocalDateTime.now(), NoteType.TASK),
                        new Note("Купить микроконтроллер", LocalDateTime.now(), NoteType.TASK),
                }),
                new NoteBook(new Note[] {
                        new Note("Продать хлеб", LocalDateTime.now(), NoteType.NOTE),
                        new Note("Продать микросхемы", LocalDateTime.now(), NoteType.TASK),
                        new Note("Продать микроконтроллер", LocalDateTime.now(), NoteType.TASK),
                }),
                new NoteBook(new Note[] {
                        new Note("Написать код", LocalDateTime.now(), NoteType.NOTE),
                        new Note("Придумать архитектуру", LocalDateTime.now(), NoteType.TASK),
                        new Note("Проверить идею", LocalDateTime.now(), NoteType.NOTE),
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
