package ru.itprogram.provider;

import ru.itprogram.entity.Note;
import ru.itprogram.entity.NoteBook;

public interface NoteBookProvider {

    NoteBook getOneRandomInstanceNoteBook();

    Note getOneRandomInstanceNote();

    NoteBook[] getNoteBook();
}
