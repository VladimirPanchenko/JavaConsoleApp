package ru.itprogram;

import ru.itprogram.provider.NoteBookProvider;
import ru.itprogram.view.NoteBookConsoleView;

public class App
{
    public static void main( String[] args ) {
        NoteBookProvider noteBookProvider = NoteBookProvider.getInstance();

        System.out.println("Вывод случайного экземпляра класса NoteBook:");
        NoteBookConsoleView.print(noteBookProvider.getOneRandomInstanceNoteBook());
        System.out.println("Вывод случайного экземпляра класса Note из случайного NoteBook:");
        NoteBookConsoleView.print(noteBookProvider.getOneRandomInstanceNote());
        System.out.println("Вывод массива NoteNook:");
        NoteBookConsoleView.print(noteBookProvider.getNoteBook());
    }
}
