package ru.itprogram;

import ru.itprogram.entity.Note;
import ru.itprogram.provider.InMemoryNoteBookProvider;
import ru.itprogram.util.CrazyLogger;
import ru.itprogram.view.NoteBookConsoleView;
import ru.itprogram.view.NoteBookView;

public class App {
    public static void main( String[] args ) {
        InMemoryNoteBookProvider noteBookProvider = InMemoryNoteBookProvider.getInstance();
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

        CrazyLogger crazyLogger = CrazyLogger.getInstance();
        for (int i = 0; i < 5; i++) {
            crazyLogger.addLogMessage(noteBookProvider.getOneRandomInstanceNote().getText());
        }
        System.out.println("Вывод всего содержимого в журнале:");
        crazyLogger.printLogMessage();
        System.out.println("Вывод записи из журнала со словом Продать:");
        crazyLogger.printLogMessageWithTextPresence("Продать");
    }
}
