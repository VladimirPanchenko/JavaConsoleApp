package ru.itprogram;

import ru.itprogram.entity.Note;
import ru.itprogram.provider.NoteBookProvider;
import ru.itprogram.view.NoteBookConsoleView;
import ru.itprogram.view.NoteBookView;

public class App
{
    public static void main( String[] args ) {
        NoteBookProvider noteBookProvider = NoteBookProvider.getInstance();
        NoteBookConsoleView noteBookConsoleView = new NoteBookConsoleView();

        System.out.println("Вывод случайного экземпляра класса NoteBook:");
        noteBookConsoleView.print(noteBookProvider.getOneRandomInstanceNoteBook());
        System.out.println("Вывод случайного экземпляра класса Note из случайного NoteBook:");
        new NoteBookView() {
            @Override
            public void print(Note note) {
                System.out.println(note);
            }
        }.print(noteBookProvider.getOneRandomInstanceNote());
        System.out.println("Вывод массива NoteNook:");
        noteBookConsoleView.print(noteBookProvider.getNoteBook());
    }
}
