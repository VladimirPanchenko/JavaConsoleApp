package ru.itprogram.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Note {
    private String text;
    private LocalDateTime recordDate;
    private NoteType noteType;

    public Note(String text, LocalDateTime recordDate, NoteType noteType) {
        this.text = text;
        this.recordDate = recordDate;
        this.noteType = noteType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDateTime recordDate) {
        this.recordDate = recordDate;
    }

    public NoteType getNoteType() {
        return noteType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(text, note.text) &&
                Objects.equals(recordDate, note.recordDate) &&
                noteType == note.noteType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, recordDate, noteType);
    }

    @Override
    public String toString() {
        return "Note{" +
                "text='" + text + '\'' +
                ", recordDate=" + recordDate +
                ", noteType=" + noteType +
                '}';
    }
}
