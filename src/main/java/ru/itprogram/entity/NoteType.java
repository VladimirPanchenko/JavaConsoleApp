package ru.itprogram.entity;

public enum NoteType {
    NOTE("Заметка"), TASK("Задача");

    private String rusName;

    private NoteType(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        return rusName;
    }

    @Override
    public String toString() {
        return "NoteType{" +
                "rusName='" + rusName + '\'' +
                '}';
    }
}
