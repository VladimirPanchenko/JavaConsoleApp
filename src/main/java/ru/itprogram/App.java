package ru.itprogram;

import ru.itprogram.provider.NoteBookProvider;
import ru.itprogram.view.NoteBookConsoleView;

public class App
{
    public static void main( String[] args ) {
        NoteBookProvider noteBookProvider = NoteBookProvider.getInstance();

        NoteBookConsoleView.print(noteBookProvider.getOneRandomInstanceNote());
        NoteBookConsoleView.print(noteBookProvider.getOneRandomInstanceNoteBook());
        NoteBookConsoleView.print(noteBookProvider.getNoteBook());
    }
}
